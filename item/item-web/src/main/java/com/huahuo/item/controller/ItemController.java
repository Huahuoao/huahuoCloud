package com.huahuo.item.controller;

import com.huahuo.item.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/item")
public class ItemController {
  @Autowired
  UserFeignService userFeignService;

  @GetMapping("/echo")
  String echo() {
    return userFeignService.echo();
  }

  @GetMapping("/store")
  void storeSession(HttpServletRequest session) {
    session.getSession().setAttribute("code", "6666");
  }

  @GetMapping("/get/code")
  Object getCode(HttpSession session) {
    System.out.println(session.getAttribute("code"));
    return session.getAttribute("code");
  }

  @GetMapping("/test/sentinel")
  void testSentinel() {

  }
}
