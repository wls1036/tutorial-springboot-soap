package com.definesys.tutorial.ws;

import com.definesys.tutorial.ws.type.Employee;
import com.definesys.tutorial.ws.type.EmployeeDetailRequest;
import com.definesys.tutorial.ws.type.EmployeeDetailResponse;
import org.springframework.stereotype.Service;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: jianfeng.zheng
 * @since: 2019/1/5 下午5:42
 * @history: 1.2019/1/5 created by jianfeng.zheng
 */
@Service
public class EmployeeService {

    public EmployeeDetailResponse getEmployee(EmployeeDetailRequest request) {

        EmployeeDetailResponse response = new EmployeeDetailResponse();

        //这里只作为演示,真正开发中需要编写业务逻辑代码
        Employee employee = new Employee();
        employee.setName("jianfeng");
        employee.setEmail("jianfeng.zheng@definesys.com");
        employee.setCode(request.getCode());
        response.setEmployee(employee);

        return response;
    }
}
