package com.fengkun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : fengkun
 * @date : 2020/5/11
 */
@RestController
@RefreshScope
public class ConfigClientController {

  @Value("${fengkun.version}")
  private String fengkunVersion;

  @GetMapping("/fengkunVersion")
  public String fengkunVersion() {
    return fengkunVersion;
  }
}
