package com.fengkun.springcloud.com.fengkun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author : fengkun
 * @date : 2020/5/10
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

  public static void main(String[] args) {
    SpringApplication.run(HystrixDashboardMain9001.class, args);
  }
}
