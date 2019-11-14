package com.aaa.li.springcloud.controller;

import com.aaa.li.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
public class BookController {

    private static final String URL = "http://BOOK-PROVIDER/";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        return restTemplate.getForObject(URL + "all", List.class);
    }

}
