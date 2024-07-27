package com.jfbarahonag.springboot_aop.springboot_aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
@Aspect
public class GreetingFooAspect {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Before("GreetingServicePointcuts.greetingLoggerFooPointcut()")
  public void loggerBefore(JoinPoint joinPoint) {

    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.info("[Foo] Antes: " + method + " con los argumentos " + args);
  }
  
  @After("GreetingServicePointcuts.greetingLoggerFooPointcut()")
  public void loggerAfter(JoinPoint joinPoint) {

    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.info("[Foo] Despues: " + method + " con los argumentos " + args);
  }

}
