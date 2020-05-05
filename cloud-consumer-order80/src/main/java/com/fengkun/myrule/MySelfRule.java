package com.fengkun.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : fengkun
 * @date : 2020/5/5
 */
@Configuration
public class MySelfRule {
  @Bean
  public IRule myRule() {
    return new RandomRule();//定义为随机
  }
}
