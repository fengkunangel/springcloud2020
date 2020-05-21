package com.fengkun.springcloud.alibaba.controller;

import com.fengkun.springcloud.alibaba.domain.CommonResult;
import com.fengkun.springcloud.alibaba.domain.Order;
import com.fengkun.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
@RestController
public class OrderController {
  @Resource
  private OrderService orderService;


  @GetMapping("/order/create")
  public CommonResult create(Order order) {
    orderService.create(order);
    return new CommonResult(200, "订单创建成功");
  }
}

