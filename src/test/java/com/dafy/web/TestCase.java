package com.dafy.web;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Auther: admin
 * @Date: 2018/9/26 11:58
 * @Description:
 */
public class TestCase {

    @Test
    public void test1(){
        String encode = new BCryptPasswordEncoder().encode("123456");
        System.out.println(encode);
        boolean matches = new BCryptPasswordEncoder().matches("123456", encode);
        System.out.println(matches);
    }
}
