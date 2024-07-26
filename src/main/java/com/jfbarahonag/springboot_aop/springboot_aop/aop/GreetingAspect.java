package com.jfbarahonag.springboot_aop.springboot_aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingAspect {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Before("execution(String com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.sayHello(..))")
  public void loggerBefore(JoinPoint joinPoint) {

    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.info("Antes: " + method + " con los argumentos " + args);
  }
}
