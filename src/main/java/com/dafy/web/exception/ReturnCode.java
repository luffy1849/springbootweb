package com.dafy.web.exception;

/**
 * @Auther: admin
 * @Date: 2018/9/21 11:04
 * @Description:
 */
public class ReturnCode {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReturnCode() {
    }

    public ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
