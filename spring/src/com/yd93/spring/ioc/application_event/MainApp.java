package com.yd93.spring.ioc.application_event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 15:33:09
 **/
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/yd93/spring/ioc/application_event/BeanE.xml");

        //开始监听事件
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        //停止监听事件
        context.stop();
    }
}
