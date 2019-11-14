package com.aaa.li.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("route",
                        p -> p.path("/baidu").
                        filters(f -> f.addRequestHeader("name", "zhangsan"))
                        .uri("http://www.baidu.com"))
                .route("route2",
                        p -> p.path("/li").
                                filters(f -> f.addRequestHeader("/all", "/allBooks"))
                                .uri("http://192.168.1.18:5081/aaa/three")).build();
    }
}
