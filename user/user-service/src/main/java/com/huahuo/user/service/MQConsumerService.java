package com.huahuo.user.service;

import com.alibaba.fastjson.JSONObject;
import com.huahuo.user.pojo.HotValue;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class MQConsumerService {
    @Service
    @RocketMQMessageListener(topic = "FOOD_HUAHUO_TOPIC", consumerGroup = "Con_Group_Two")
    public class ConsumerSend2 implements RocketMQListener<String> {
        @Override
        public void onMessage(String str) {
            HotValue hotValue = JSONObject.parseObject(str, HotValue.class);
            log.info("监听到消息：value={},id={}", hotValue.getValue(), hotValue.getId());
        }
    }


}

