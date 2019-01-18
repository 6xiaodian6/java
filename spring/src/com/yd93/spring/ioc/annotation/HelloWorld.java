package com.yd93.spring.ioc.annotation;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 13:17:52
 **/
public class HelloWorld {
    private String message;

    public String getMessage() {
        System.out.println("展示信息：" + message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void init(){
        System.out.println("Bean正在去初始化......");
    }
    public void destroy(){
        System.out.println("Bean将会去销毁！！！");
    }
}
