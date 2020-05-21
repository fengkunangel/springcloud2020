package com.fengkun.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
@Mapper
public interface AccountDao {

  /**
   * 扣减账户余额
   */
  void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
