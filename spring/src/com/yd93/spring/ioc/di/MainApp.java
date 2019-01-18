package com.yd93.spring.ioc.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-12 12:51:54
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/yd93/spring/ioc/Bean.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
