package com.yd93.spring.ioc.di;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-12 12:45:07
 **/
public class SpellChecker {
    public SpellChecker(){
        System.out.println("内部Specllchecker类中的构造方法");
    }
    public void checkSpelling(){
        System.out.println("内部checkSpelling中的方法");
    }
}
