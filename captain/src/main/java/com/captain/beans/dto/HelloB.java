package com.captain.beans.dto;

/**
 * @auth sailor
 * @date 2022/7/20 14:17
 * @desc HelloB
 */

public class HelloB extends  HelloA {
    public HelloB(){
        System.out.println("HelloB");

    }
    {
        System.out.println("I'm B class");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}