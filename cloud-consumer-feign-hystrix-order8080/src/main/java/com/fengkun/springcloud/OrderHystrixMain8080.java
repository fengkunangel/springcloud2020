package com.fengkun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : fengkun
 * @date : 2020/5/8
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain8080 {
  public static void main(String[] args) {
    SpringApplication.run(OrderHystrixMain8080.class, args);
  }
}
