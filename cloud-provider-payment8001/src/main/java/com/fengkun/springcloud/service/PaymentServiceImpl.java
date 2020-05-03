package com.fengkun.springcloud.service;

import com.fengkun.springcloud.dao.PaymentDao;
import com.fengkun.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : fengkun
 * @date : 2020/5/2
 */
@Service
public class PaymentServiceImpl implements PaymentService {

  @Resource
  private PaymentDao paymentDao;

  @Override
  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  @Override
  public Payment getPaymentById(Long id) {
    return paymentDao.getPaymentById(id);
  }
}
