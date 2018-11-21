package com.dafy.web;

import com.dafy.web.mq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

/**
 * @Auther: admin
 * @Date: 2018/11/21 15:22
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMq {

    @Autowired
    private Producer producer;

    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("myQueue");

        for(int i=0; i<100; i++){
            System.out.println("我发送的消息"+i);
            producer.sendMessage(destination, "我发送的消息"+i);
        }
    }
}
