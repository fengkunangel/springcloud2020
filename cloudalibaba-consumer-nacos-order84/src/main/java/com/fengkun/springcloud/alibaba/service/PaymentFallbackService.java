package com.fengkun.springcloud.alibaba.service;

import com.fengkun.springcloud.entities.CommonResult;
import com.fengkun.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author : fengkun
 * @date : 2020/5/18
 */
@Component
public class PaymentFallbackService implements PaymentService {
  @Override
  public CommonResult<Payment> paymentSQL(Long id) {
    return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
  }
}
