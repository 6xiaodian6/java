package com.yd93.spring.aop.xmlframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-16 08:44:31
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yd93/spring/aop/xmlframework/Bean.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        //抛出这个异常不用担心，因为这是你自己写的一个异常并且还调用了。
        student.printThrowException();
    }
}
