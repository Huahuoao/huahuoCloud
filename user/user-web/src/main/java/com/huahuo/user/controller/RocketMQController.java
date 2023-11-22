package com.huahuo.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.huahuo.user.pojo.HotValue;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rocketmq")
public class RocketMQController {
    @Autowired
    private RocketMQTemplate rocketmqTemplate;
    private static final String topic = "FOOD_HUAHUO_TOPIC";

    @GetMapping("/test")
    public void test() {
        HotValue hotValue = new HotValue();
        hotValue.setValue(100);
        hotValue.setId(10L);
        String jsonString = JSONObject.toJSONString(hotValue);
        Message<String> msg = MessageBuilder.withPayload(jsonString).build();
        rocketmqTemplate.send(topic, msg);
    }

}
