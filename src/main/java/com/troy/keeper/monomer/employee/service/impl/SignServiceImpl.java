package com.troy.keeper.monomer.employee.service.impl;

import com.troy.keeper.monomer.employee.domain.SignInfo;
import com.troy.keeper.monomer.employee.dto.SignDTO;
import com.troy.keeper.monomer.employee.repository.SignInfoRepository;
import com.troy.keeper.monomer.employee.service.SignService;
import com.troy.keeper.monomer.employee.service.mapper.SignMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Date:     2018/1/24 9:38<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Service
@Transactional
public class SignServiceImpl implements SignService {
    @Autowired
    SignInfoRepository signInfoRepository;
    @Autowired
    SignMapper mapper;

    @Override
    public boolean signIn(SignDTO signDTO) throws Exception {
        SignInfo signInfo = new SignInfo();
        signInfo.setSingUser(signDTO.getSingUser());
        signInfo.setSingType("1");
        signInfo.setSingClientType("2");
        signInfo.setLatitude(signDTO.getLatitude());
        signInfo.setLongitude(signDTO.getLongitude());
        signInfo.setStatus("1");
        signInfoRepository.save(signInfo);
        return true;
    }

    @Override
    public boolean signOut(SignDTO signDTO) throws Exception {
        SignInfo signInfo = new SignInfo();
        signInfo.setSingUser(signDTO.getSingUser());
        signInfo.setSingType("2");
        signInfo.setSingClientType("2");
        signInfo.setLatitude(signDTO.getLatitude());
        signInfo.setLongitude(signDTO.getLongitude());
        signInfo.setStatus("1");
        signInfoRepository.save(signInfo);
        return true;
    }

    @Override
    public List<SignDTO> getSignList(SignDTO signDTO) throws Exception {
        List<SignInfo> signInfoList = signInfoRepository.findAll(getSpec(signDTO));
        return mapper.objToDTO(signInfoList);
    }

    private Specification<SignInfo> getSpec(SignDTO signDTO) {
        Specification<SignInfo> spec = new Specification<SignInfo>(){
            @Override
            public Predicate toPredicate(Root<SignInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();
                if(signDTO.getSingUser() != null){
                    predicates.add(cb.equal(root.get("singUser"), signDTO.getSingUser()));
                }
                if(signDTO.getSignDateTimeStart() != null){
                    predicates.add(cb.greaterThanOrEqualTo(root.get("createdDate"), signDTO.getSignDateTimeStart().toEpochMilli()));
                }
                if(signDTO.getSignDateTimeEnd() != null){
                    predicates.add(cb.lessThanOrEqualTo(root.get("createdDate"), signDTO.getSignDateTimeEnd().toEpochMilli()));
                }
                return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
            }
        };
        return spec;
    }

    @Override
    public Page<SignDTO> getSignListPage(SignDTO signDTO, Pageable pageable) throws Exception {
        Page<SignInfo> signInfos = signInfoRepository.findAll(getSpec(signDTO), pageable);
        Page<SignDTO> signDTOPage = signInfos.map(new Converter<SignInfo, SignDTO>() {
            @Override
            public SignDTO convert(SignInfo source) {
                return mapper.objToDTO(source);
            }
        });
        return signDTOPage;
    }
}
