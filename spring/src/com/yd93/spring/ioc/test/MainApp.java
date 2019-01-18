package com.yd93.spring.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/yd93/spring/ioc/Bean.xml");

        //只要是对文件系统的操作（即File）都要使用实际的绝对路径，而不要使用工程里的相对路径，因为文件的操作可能是在任何地方，不仅仅是工程里面的
//        ApplicationContext context2 =
//                new FileSystemXmlApplicationContext("C:/Users/Administrator/Desktop/Spring/src/Bean.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        //spring通过读取Bean的配置信息来实例化Bean，然后将Bean实例放到spring容器中的Bean缓存池中等待应用程序的调用，最后，运行应用程序时从spring中的Bean缓冲池中使用Bean
        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("com/yd93/spring/ioc/Bean.xml");
        HelloWorld obj1 = (HelloWorld)context1.getBean("helloWorld");
        obj1.getMessage();
        context1.registerShutdownHook();

        ApplicationContext context2 = new ClassPathXmlApplicationContext("com/yd93/spring/ioc/Bean.xml");
        HelloWorld2 objA = (HelloWorld2)context2.getBean("helloworld2");
        objA.getMessage1();
        objA.getMessage2();

        HelloIndia objB = (HelloIndia)context2.getBean("helloIndia");
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
