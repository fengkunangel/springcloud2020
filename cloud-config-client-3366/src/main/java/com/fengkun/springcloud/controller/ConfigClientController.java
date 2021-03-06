package com.fengkun.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : fengkun
 * @date : 20-5-12
 */
@RestController
@RefreshScope
public class ConfigClientController {
  @Value("${server.port}")
  private String serverPort;

  @Value("${fengkun.version}")
  private String fengkunVersion;

  @GetMapping("/fengkunVersion")
  public String fengkunVersion() {
    return "serverPort: " + serverPort + "\t\n\n envDev: " + fengkunVersion;
  }

}