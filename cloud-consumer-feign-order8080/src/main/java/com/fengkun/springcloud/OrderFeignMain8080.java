package com.fengkun.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : fengkun
 * @date : 2020/5/6
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8080 {

  public static void main(String[] args) {
    SpringApplication.run(OrderFeignMain8080.class, args);
  }
}
