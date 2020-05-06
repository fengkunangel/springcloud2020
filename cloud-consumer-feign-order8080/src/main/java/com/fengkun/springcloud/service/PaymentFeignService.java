package com.fengkun.springcloud.service;

import com.fengkun.springcloud.entities.CommonResult;
import com.fengkun.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : fengkun
 * @date : 2020/5/6
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

  @GetMapping(value = "/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

  @GetMapping(value = "/payment/feign/timeout")
  public String paymentFeignTimeout();
}
