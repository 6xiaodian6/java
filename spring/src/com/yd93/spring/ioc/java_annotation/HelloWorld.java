package com.yd93.spring.ioc.java_annotation;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 13:42:53
 **/
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println("展示信息：" + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
