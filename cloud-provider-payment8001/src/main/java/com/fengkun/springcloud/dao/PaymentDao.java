package com.fengkun.springcloud.dao;

import com.fengkun.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : fengkun
 * @date : 2020/5/2
 */
@Mapper
public interface PaymentDao {

  int create(Payment payment);

  Payment getPaymentById(@Param("id") Long id);
}
