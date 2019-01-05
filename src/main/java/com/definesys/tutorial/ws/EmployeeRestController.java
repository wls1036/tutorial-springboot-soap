package com.definesys.tutorial.ws;

import com.definesys.tutorial.ws.type.EmployeeDetailRequest;
import com.definesys.tutorial.ws.type.EmployeeDetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: jianfeng.zheng
 * @since: 2019/1/5 下午5:43
 * @history: 1.2019/1/5 created by jianfeng.zheng
 */
@RestController
@RequestMapping(value = "/rest")
public class EmployeeRestController {

    @Autowired
    private EmployeeService service;

    @RequestMapping(value = "/employee-detail", method = RequestMethod.POST)
    public EmployeeDetailResponse getEmployeeDetail(@RequestBody EmployeeDetailRequest request) {
        return service.getEmployee(request);
    }
}
