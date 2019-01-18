package com.yd93.spring.ioc.java_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 13:46:55
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        helloWorld.setMessage("hello World!!");
        helloWorld.getMessage();

        ApplicationContext context1 =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = context1.getBean(TextEditor.class);

        te.spellCheck();
    }
}
