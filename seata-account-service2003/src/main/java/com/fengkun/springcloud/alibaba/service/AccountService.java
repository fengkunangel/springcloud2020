package com.fengkun.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
public interface AccountService {

  /**
   * 扣减账户余额
   *
   * @param userId 用户id
   * @param money  金额
   */
  void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
