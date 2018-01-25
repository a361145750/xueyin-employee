package com.troy.keeper.monomer.employee.service;

import com.troy.keeper.monomer.employee.dto.ReportDTO;
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
public interface ReportService {

    boolean save(ReportDTO reportDTO) throws Exception;

    List<SignDTO> getReportList(ReportDTO reportDTO) throws Exception;

    Page<SignDTO> getReportListPage(ReportDTO reportDTO, Pageable pageable) throws Exception;
}
