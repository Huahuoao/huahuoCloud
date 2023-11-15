package com.huahuo.item.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("huahuo-user") // 指向服务提供者应用
public interface UserFeignService {
    @GetMapping("/echo")
    String echo();

}
