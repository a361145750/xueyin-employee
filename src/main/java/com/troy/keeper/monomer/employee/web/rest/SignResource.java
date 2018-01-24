package com.troy.keeper.monomer.employee.web.rest;

import com.troy.keeper.core.base.dto.ResponseDTO;
import com.troy.keeper.core.base.rest.BaseResource;
import com.troy.keeper.monomer.employee.dto.SignDTO;
import com.troy.keeper.monomer.employee.service.SignService;
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
public class SignResource extends BaseResource{
    public static Logger log = LoggerFactory.getLogger(SignResource.class);

    @Autowired
    SignService signService;

    @RequestMapping(value = "/api/employee/signIn", method = RequestMethod.POST)
    public ResponseDTO<Void> signIn(@RequestBody SignDTO signDTO) throws Exception {
        try {
            if(signDTO.getSingUser() == null){
                fail("用户为空！");
            }
            if(signService.signIn(signDTO)){
                return success();
            }
            return fail();
        }catch (Exception e) {
            log.error(e.getMessage(), e);
            return fail();
        }
    }

    @RequestMapping(value = "/api/employee/signOut", method = RequestMethod.POST)
    public ResponseDTO<Void> signOut(@RequestBody SignDTO signDTO) throws Exception {
        try {
            if(signDTO.getSingUser() == null){
                fail("用户为空！");
            }
            if(signService.signOut(signDTO)){
                return success();
            }
            return fail();
        }catch (Exception e) {
            log.error(e.getMessage(), e);
            return fail();
        }
    }

    @RequestMapping(value = "/api/employee/getSignList", method = RequestMethod.POST)
    public ResponseDTO<List<SignDTO>> getSignList(@RequestBody SignDTO signDTO) throws Exception {
        try {
            if(signDTO.getSingUser() == null){
                fail("用户为空！");
            }
            return success(signService.getSignList(signDTO));
        }catch (Exception e) {
            log.error(e.getMessage(), e);
            return fail();
        }
    }

    @RequestMapping(value = "/api/employee/getSignListPage", method = RequestMethod.POST)
    public ResponseDTO<List<SignDTO>> getSignListPage(@RequestBody SignDTO signDTO, Pageable pageable) throws Exception {
        try {
            if(signDTO.getSingUser() == null){
                fail("用户为空！");
            }
            return success(signService.getSignListPage(signDTO, pageable));
        }catch (Exception e) {
            log.error(e.getMessage(), e);
            return fail();
        }
    }
}
