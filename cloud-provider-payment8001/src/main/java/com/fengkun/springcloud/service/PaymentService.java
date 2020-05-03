package com.fengkun.springcloud.service;

import com.fengkun.springcloud.entities.Payment;

/**
 * @author : fengkun
 * @date : 2020/5/2
 */
public interface PaymentService {

  int create(Payment payment);

  Payment getPaymentById(Long id);
}
