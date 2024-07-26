package com.jfbarahonag.springboot_aop.springboot_aop.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingAspect {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Before("execution(* com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.*(..))")
  public void loggerBefore(JoinPoint joinPoint) {

    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.info("Antes: " + method + " con los argumentos " + args);
  }
  
  @After("execution(* com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.*(..))")
  public void loggerAfter(JoinPoint joinPoint) {

    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.info("Despues: " + method + " con los argumentos " + args);
  }
  
  @AfterReturning("execution(* com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.*(..))")
  public void loggerAfterReturning(JoinPoint joinPoint) {
    
    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.info("Despues Exitoso: " + method + " con los argumentos " + args);

  }
  
  @AfterThrowing("execution(* com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.*(..))")
  public void loggerAfterThrowing(JoinPoint joinPoint) {
    
    String method = joinPoint.getSignature().getName();
    String args = Arrays.toString(joinPoint.getArgs());
  
    logger.error("Despues fallo: " + method + " con los argumentos " + args);

  }
}
