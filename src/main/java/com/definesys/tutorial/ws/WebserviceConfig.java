package com.definesys.tutorial.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * @Copyright: Shanghai Definesys Company.All rights reserved.
 * @Description:
 * @author: jianfeng.zheng
 * @since: 2019/1/5 下午4:46
 * @history: 1.2019/1/5 created by jianfeng.zheng
 */

@EnableWs
@Configuration
public class WebserviceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

//    @Bean(name = "employee")
//    public Wsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
//        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
//        wsdl.setPortTypeName("EmployeePort");
//        wsdl.setLocationUri("/ws/employee-detail");
//        wsdl.setTargetNamespace("http://www.definesys.com/xml/employee1");
//        wsdl.setSchema(schema);
//        return wsdl;
//    }

//    @Bean
//    public XsdSchema employeeSchema() {
//        return new SimpleXsdSchema(new ClassPathResource("employee.xsd"));
//    }
}
