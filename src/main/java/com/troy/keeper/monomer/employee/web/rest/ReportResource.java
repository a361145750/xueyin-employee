package com.troy.keeper.monomer.employee.web.rest;

import com.troy.keeper.core.base.dto.ResponseDTO;
import com.troy.keeper.core.base.rest.BaseResource;
import com.troy.keeper.monomer.employee.dto.ReportDTO;
import com.troy.keeper.monomer.employee.dto.SignDTO;
import com.troy.keeper.monomer.employee.service.ReportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Date:     2018/1/23 16:20<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@RestController
public class ReportResource extends BaseResource{
    public static Logger log = LoggerFactory.getLogger(ReportResource.class);

    @Autowired
    ReportService reportService;

    @RequestMapping(value = "/api/employee/saveReport", method = RequestMethod.POST)
    public ResponseDTO<Void> saveReport(@RequestBody ReportDTO reportDTO) throws Exception {
        try {
            if(reportDTO.getReportUser() == null){
                fail("用户为空！");
            }
            if(reportService.save(reportDTO)){
                return success();
            }
            return fail();
        }catch (Exception e) {
            log.error(e.getMessage(), e);
            return fail();
        }
    }

    @RequestMapping(value = "/api/employee/publicReport", method = RequestMethod.POST)
    public ResponseDTO<Void> publicReport(@RequestBody ReportDTO reportDTO) throws Exception {
        return null;
    }

    @RequestMapping(value = "/api/employee/getReportDetail", method = RequestMethod.POST)
    public ResponseDTO<List<SignDTO>> getReportDetail(@RequestBody ReportDTO reportDTO) throws Exception {
        return null;
    }

    @RequestMapping(value = "/api/employee/getReportList", method = RequestMethod.POST)
    public ResponseDTO<List<SignDTO>> getSignList(@RequestBody ReportDTO reportDTO) throws Exception {
        return null;
    }

    @RequestMapping(value = "/api/employee/getReportListPage", method = RequestMethod.POST)
    public ResponseDTO<List<SignDTO>> getSignListPage(@RequestBody ReportDTO reportDTO, Pageable pageable) throws Exception {
        return null;
    }
}
