package com.yd93.spring.ioc.test;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage(){
        System.out.println("Your Message : "+message);
    }
    public void init(){
        System.out.println("多实例Bean执行初始化");
    }
    public void destroy(){
        System.out.println("多实例Bean执行销毁");
    }
}
