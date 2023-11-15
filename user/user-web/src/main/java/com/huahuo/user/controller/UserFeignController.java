package com.huahuo.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserFeignController {
    @Value("${server.port}")
    String port;

    @GetMapping("/echo")
    public String echo() {
        return "hello 服务提供方：server.port = " + port;
    }


}
