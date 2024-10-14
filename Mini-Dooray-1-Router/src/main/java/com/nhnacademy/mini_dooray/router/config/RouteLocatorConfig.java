package com.nhnacademy.mini_dooray.router.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder) {

        RouteLocator routeLocator = builder.routes().build();

        return builder.routes()
                .route("gateway-account-register",
                        p -> p.path("/register").and()
                                .uri("lb://GATEWAY")
                )
                .build();
    }
}
