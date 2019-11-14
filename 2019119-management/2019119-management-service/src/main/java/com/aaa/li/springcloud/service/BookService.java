package com.aaa.li.springcloud.service;


import com.aaa.li.springcloud.mapper.BookMapper;
import com.aaa.li.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> getAll(){
        return bookMapper.getAll();
    }
}
