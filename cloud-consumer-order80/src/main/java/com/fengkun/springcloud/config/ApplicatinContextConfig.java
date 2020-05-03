package com.fengkun.springcloud.config;

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
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
