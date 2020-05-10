package com.fengkun.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : fengkun
 * @date : 2020/5/10
 */
@Configuration
public class GateWayConfig {

  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
    RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

    routes.route("path_route_fengkun",
        r -> r.path("/finance")
            .uri("http://news.baidu.com/finance")).build();

    return routes.build();
  }
}
