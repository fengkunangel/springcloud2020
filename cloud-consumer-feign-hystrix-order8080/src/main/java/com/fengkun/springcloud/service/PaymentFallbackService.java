package com.fengkun.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author : fengkun
 * @date : 2020/5/9
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

  @Override
  public String paymentInfo_OK(Integer id) {
    return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(тХея╣ПтХе)o";
  }

  @Override
  public String paymentInfo_TimeOut(Integer id) {
    return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(тХея╣ПтХе)o";
  }
}
