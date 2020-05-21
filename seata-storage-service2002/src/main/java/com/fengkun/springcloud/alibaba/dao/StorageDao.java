package com.fengkun.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : fengkun
 * @date : 20-5-21
 */

@Mapper
public interface StorageDao {

  //扣减库存
  void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
