package com.dafy.web.controller;

import com.dafy.web.exception.BusinessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: admin
 * @Date: 2018/9/21 11:11
 * @Description:
 */
@Controller
public class TestController {
    @GetMapping(value = {"test1.htm"})
    public String test1() throws BusinessException {
        if (true){
            throw new BusinessException("发生异常了...");
        }
        return "login/login";
    }
}
