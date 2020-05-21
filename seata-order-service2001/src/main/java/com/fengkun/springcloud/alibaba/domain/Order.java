package com.fengkun.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
  private Long id;

  private Long userId;

  private Long productId;

  private Integer count;

  private BigDecimal money;

  private Integer status; //订单状态：0：创建中；1：已完结
}