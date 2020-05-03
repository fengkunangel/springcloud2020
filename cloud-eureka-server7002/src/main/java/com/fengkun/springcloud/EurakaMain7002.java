package com.fengkun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : fengkun
 * @date : 2020/5/3
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakaMain7002 {

  public static void main(String[] args) {
    SpringApplication.run(EurakaMain7002.class, args);
  }
}
