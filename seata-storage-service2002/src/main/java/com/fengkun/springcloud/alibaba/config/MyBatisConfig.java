package com.fengkun.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
@Configuration
@MapperScan({"com.fengkun.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
