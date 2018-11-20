package com.dafy.web.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @Auther: admin
 * @Date: 2018/10/23 18:14
 * @Description:
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue myFirstQueue(){
        return new Queue("emailQueue");
    }
}
