package com.jfbarahonag.springboot_aop.springboot_aop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/greetings")
public class GreetingController {
  @PostMapping("/single")
  public ResponseEntity<?> greeting() {
      
      return ResponseEntity.ok().body(
        Collections.singletonMap("greeting", null)
      );
  }
  
}
