package com.troy.keeper.monomer.employee.service.impl;

import com.troy.keeper.monomer.employee.dto.ReportDTO;
import com.troy.keeper.monomer.employee.dto.SignDTO;
import com.troy.keeper.monomer.employee.service.ReportService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Date:     2018/1/25 10:26<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public class ReportServiceImpl implements ReportService {
    @Override
    public boolean save(ReportDTO reportDTO) throws Exception {
        return false;
    }

    @Override
    public List<SignDTO> getReportList(ReportDTO reportDTO) throws Exception {
        return null;
    }

    @Override
    public Page<SignDTO> getReportListPage(ReportDTO reportDTO, Pageable pageable) throws Exception {
        return null;
    }
}
