package com.fengkun.springcloud.alibaba.service;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
public interface StorageService {

  /**
   * 扣减库存
   */
  void decrease(Long productId, Integer count);
}

