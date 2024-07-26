package com.jfbarahonag.springboot_aop.springboot_aop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jfbarahonag.springboot_aop.springboot_aop.services.GreetingService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

  @Autowired
  private GreetingService greetingService;
  @PostMapping("/single")
  public ResponseEntity<?> greeting() {
      
      return ResponseEntity.ok().body(
        Collections.singletonMap("greeting", greetingService.sayHello("Felipe", 3))
      );
  }
  
}
