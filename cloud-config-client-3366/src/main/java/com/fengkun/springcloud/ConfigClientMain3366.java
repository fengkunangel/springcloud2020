package com.fengkun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author : fengkun
 * @date : 20-5-12
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
  public static void main(String[] args) {
    SpringApplication.run(ConfigClientMain3366.class, args);
  }
}
