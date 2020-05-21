package com.fengkun.springcloud.alibaba.service;

import com.fengkun.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : fengkun
 * @date : 20-5-21
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

  @PostMapping(value = "/storage/decrease")
  CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
