package com.huahuo.item.controller;

import com.huahuo.item.service.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    UserFeignService userFeignService;

    @GetMapping("/echo")
    String echo() {
        return userFeignService.echo();
    }
}
