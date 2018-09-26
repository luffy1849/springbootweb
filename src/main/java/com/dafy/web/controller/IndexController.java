package com.dafy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: admin
 * @Date: 2018/9/21 15:39
 * @Description:
 */
@Controller
public class IndexController {

    /**
     * 跳转到主页
     * @param request
     * @return
     */
    @GetMapping("/index_v1")
    public String login(HttpServletRequest request){
        String error = request.getParameter("error");
        System.out.println(error);
        return "index_v1";
    }
}
