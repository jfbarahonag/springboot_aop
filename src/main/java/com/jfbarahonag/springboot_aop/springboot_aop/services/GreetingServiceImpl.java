package com.jfbarahonag.springboot_aop.springboot_aop.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

  @Override
  public String sayHello(String name, int times) {
    StringBuilder builder = new StringBuilder();
    for (int i=0; i<times; i++) {
      builder.append(i+1 + ") Hello " + name + "\n");
    }
    return builder.toString();
  }

}
