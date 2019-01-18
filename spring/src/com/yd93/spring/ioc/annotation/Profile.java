package com.yd93.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 11:21:30
 **/
public class Profile {
    @Autowired
    @Qualifier("student1")
    private Student student;
    public Profile(){
        System.out.println("内部Profile构造方法");
    }
    public void printAge(){
        System.out.println("Profile类产生的 Age:" + student.getAge());
    }
    public void printName(){
        System.out.println("Profile类产生的 Name:" + student.getName());
    }
}
