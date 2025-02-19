package com.jfbarahonag.springboot_aop.springboot_aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class GreetingServicePointcuts {

  @Pointcut("execution(* com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.*(..))")
  public void greetingLoggerPointcut() {}

  @Pointcut("execution(* com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService.*(..))")
  public void greetingLoggerFooPointcut() {}

}
