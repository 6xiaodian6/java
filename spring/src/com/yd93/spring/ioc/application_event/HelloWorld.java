package com.yd93.spring.ioc.application_event;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 15:23:46
 **/
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("展示信息：" + message);
    }
}
