package com.yd93.spring.ioc.autowire;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-12 17:16:30
 **/
public class SpellChecker {
    public SpellChecker(){
        System.out.println("自动装配产生的内部构造器");
    }
    public void checkSpelling(){
        System.out.println("自动装配产生的checkSpelling方法");
    }
}
