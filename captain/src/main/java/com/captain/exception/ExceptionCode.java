package com.captain.exception;

public enum ExceptionCode {

    /**
     * 异常
     */
    EXCEPTION(10001, "系统错误"),

    NO_LOGIN(20001, "账号或者密码错误，请重试!"),


    ;


    private int code;
    private String msg;
    ExceptionCode(int code, String msg) {
    }
}
