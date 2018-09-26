package com.dafy.web.exception;

/**
 * @Auther: admin
 * @Date: 2018/9/21 11:01
 * @Description:
 */
public class BusinessException extends Exception {
    /**
     * 构造器
     * @param message
     */
    public BusinessException(String message){
        super(message);
    }

}
