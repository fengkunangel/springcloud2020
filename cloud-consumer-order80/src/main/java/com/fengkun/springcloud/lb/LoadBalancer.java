package com.fengkun.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author : fengkun
 * @date : 2020/5/5
 */
public interface LoadBalancer {

  ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
