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
public class NacosConfigClientMain3377 {
  public static void main(String[] args) {
    SpringApplication.run(NacosConfigClientMain3377.class, args);
  }
}
