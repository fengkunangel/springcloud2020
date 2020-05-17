package com.fengkun.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.fengkun.springcloud.entities.CommonResult;

/**
 * @author : fengkun
 * @date : 2020/5/17
 */
public class CustomerBlockHandler {
  public static CommonResult handlerException(BlockException exception) {
    return new CommonResult(4444, "按客戶自定义,global handlerException----1");
  }

  public static CommonResult handlerException2(BlockException exception) {
    return new CommonResult(4444, "按客戶自定义,global handlerException----2");
  }
}
