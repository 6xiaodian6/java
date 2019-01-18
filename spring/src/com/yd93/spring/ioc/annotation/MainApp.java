package com.yd93.spring.ioc.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 09:24:47
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yd93/spring/ioc/annotation/BeanA.xml");

        //setter方法的注解。它表明受影响的Bean属性在配置时必须放在XML配置文件中，即@Require注解
        Student student = (Student) context.getBean("student");
        System.out.println("student类产生的 Name:" + student.getName());
        System.out.println("student类产生的 Age:" + student.getAge());

        //@Autowire注解，在@Required的基础上进一步对注解进行详细的操作
        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();

        //@Qualifier注解
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();

        //JSR-250注解
        AbstractApplicationContext context1 =
                new ClassPathXmlApplicationContext("com/yd93/spring/ioc/annotation/BeanA.xml");
        HelloWorld obj = (HelloWorld) context1.getBean("helloWorld");
        obj.getMessage();
        context1.registerShutdownHook();

    }
}
