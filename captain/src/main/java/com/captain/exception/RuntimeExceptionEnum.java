package com.captain.exception;

public enum RuntimeExceptionEnum {

    NO_LOGIN(10001, "账号或者密码错误，请重试!");


    RuntimeExceptionEnum(int code, String msg) {
    }
}
