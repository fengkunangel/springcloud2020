package com.fengkun.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : fengkun
 * @date : 2020/5/2
 */
@Configuration
public class ApplicatinContextConfig {

  @Bean
  @LoadBalanced // 赋予RestTemplate负载均衡的能力
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
