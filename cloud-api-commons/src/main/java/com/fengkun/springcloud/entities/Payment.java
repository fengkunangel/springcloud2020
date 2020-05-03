package com.fengkun.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : fengkun
 * @date : 2020/5/2
 * 内容 ： 支付
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

  private Long id;
  private String serial;
}
