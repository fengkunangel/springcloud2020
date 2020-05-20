package com.fengkun.springcloud.alibaba.service;

import com.fengkun.springcloud.entities.CommonResult;
import com.fengkun.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : fengkun
 * @date : 2020/5/18
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
  @GetMapping(value = "/paymentSQL/{id}")
  public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
