package com.definesys.tutorial.ws;

import com.definesys.tutorial.ws.type.Employee;
import com.definesys.tutorial.ws.type.EmployeeDetailRequest;
import com.definesys.tutorial.ws.type.EmployeeDetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: jianfeng.zheng
 * @since: 2019/1/5 下午4:49
 * @history: 1.2019/1/5 created by jianfeng.zheng
 */
@Endpoint
public class EmployeeSoapController {

    @Autowired
    private EmployeeService service;

    private static final String NAMESPACE_URI = "http://www.definesys.com/xml/employee";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "EmployeeDetailRequest")
    @ResponsePayload
    public EmployeeDetailResponse getEmployee(@RequestPayload EmployeeDetailRequest request) {

        return service.getEmployee(request);
    }
}
