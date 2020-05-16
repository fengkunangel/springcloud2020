package com.fengkun.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : fengkun
 * @date : 2020/5/16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain9002.class, args);
  }
}
