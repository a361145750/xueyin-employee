package com.troy.keeper.monomer.employee.service.mapper;

import com.troy.keeper.monomer.employee.domain.SignInfo;
import com.troy.keeper.monomer.employee.dto.SignDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Date:     2018/1/24 11:52<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Mapper(componentModel = "spring", uses = {})
public interface SignMapper {
    @Mapping(target = "signDateTime", expression = "java(java.time.Instant.ofEpochMilli(signInfo.getCreatedDate()))")
    SignDTO objToDTO(SignInfo signInfo);

    List<SignDTO> objToDTO(List<SignInfo> signInfo);
}
