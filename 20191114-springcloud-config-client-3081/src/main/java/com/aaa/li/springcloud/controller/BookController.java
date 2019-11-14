package com.aaa.li.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypePackage;
    @RequestMapping("/all")
    public String getString(){
        return port+"1234"+driverClassName+"1234"+mybatisTypePackage;
    }

}
