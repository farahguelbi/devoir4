package com.farah.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayserverApplication.class, args);
    }
/*
    @Bean
    public RouteLocator MyRouteConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route("genre_route", r -> r
                        .path("/GENRE-MED-SERVICE/**")
                        .filters(f -> f.stripPrefix(1))  // enlève le premier segment
                        .uri("lb://GENRE-MED-SERVICE"))
                .route("patient_route", r -> r
                        .path("/PATIENT/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://PATIENT"))
                .build();
    }
*/
}
