package com.aaa.li.springcloud.controller;

import com.aaa.li.springcloud.model.Book;
import com.aaa.li.springcloud.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private ISpringCloudService iSpringCloudService;

    @GetMapping("/all")
    public List<Book> selectAllBooks(){
        return iSpringCloudService.selectAllBooks();
    }

}
