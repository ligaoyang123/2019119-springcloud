package com.aaa.li.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @RequestMapping("/all")
    public List<String> selectAllString() {
        List<String> strList = new ArrayList<String>();
        String str = "ligaoyang";
        strList.add(str);
        return strList;
    }
}
