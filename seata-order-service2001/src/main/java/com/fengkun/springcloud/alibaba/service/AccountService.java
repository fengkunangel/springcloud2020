package com.fengkun.springcloud.alibaba.service;

import com.fengkun.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

  @PostMapping(value = "/account/decrease")
  CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
