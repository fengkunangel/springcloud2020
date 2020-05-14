package com.fengkun.springcloud.controller;

import com.fengkun.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : fengkun
 * @date : 20-5-13
 */
@RestController
public class SendMessageController {

  @Resource
  private IMessageProvider messageProvider;

  @GetMapping(value = "/sendMessage")
  public String sendMessage() {
    return messageProvider.send();
  }
}
