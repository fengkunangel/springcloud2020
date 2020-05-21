package com.fengkun.springcloud.alibaba.service;

import com.fengkun.springcloud.alibaba.domain.Order;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
public interface OrderService {

  void create(Order order);
}