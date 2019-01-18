package com.yd93.spring.ioc.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-15 11:03:28
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yd93/spring/ioc/component/BeanC.xml");

        System.out.println("开始加载bean文件");
        User user = (User) context.getBean("user");
        user.fun();
    }
}
