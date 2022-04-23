package com.captain.exception;

/**
 * @auth sailor
 * @date 2022/4/23 22:04
 * @desc RegisterException
 */
public class RegisterException extends Exception {

    public RegisterException() {
        super();
    }
    //添加一个带异常信息的构造方法
    public RegisterException(String s, RuntimeException runtimeException) {
        super(s, runtimeException);
    }

}
