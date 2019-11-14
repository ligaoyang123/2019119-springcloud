package com.aaa.li.springcloud.fallback;

import com.aaa.li.springcloud.model.Book;
import com.aaa.li.springcloud.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ISpringcloudFallbackFactory implements FallbackFactory<ISpringCloudService> {
    @Override
    public ISpringCloudService create(Throwable throwable) {
        return new ISpringCloudService() {
            @Override
            public List<Book> selectAllBooks(){
                System.out.println("测试熔断方法");
                return null;
            }

        };
    }
}
