package com.aaa.li.springcloud.service;

import com.aaa.li.springcloud.fallback.ISpringcloudFallbackFactory;
import com.aaa.li.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "BOOK-PROVIDER", fallbackFactory = ISpringcloudFallbackFactory.class)
public interface ISpringCloudService {
    @RequestMapping("/all")
    List<Book> selectAllBooks();
}
