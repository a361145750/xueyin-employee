package com.troy.keeper.monomer.employee.service;

import com.troy.keeper.monomer.employee.dto.SignDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Date:     2018/1/23 16:23<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public interface SignService {

    boolean signIn(SignDTO signDTO) throws Exception;

    boolean signOut(SignDTO signDTO) throws Exception;

    List<SignDTO> getSignList(SignDTO signDTO) throws Exception;

    Page<SignDTO> getSignListPage(SignDTO signDTO, Pageable pageable) throws Exception;
}
