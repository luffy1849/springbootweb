package com.dafy.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfigurer implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.htm").setViewName("/login/login");
        registry.addViewController("/").setViewName("/index.html");
        registry.addViewController("/dashboard.htm").setViewName("/index_v1");
        registry.addViewController("/graph_echarts.htm").setViewName("/echart/graph_echarts");
    }

}
