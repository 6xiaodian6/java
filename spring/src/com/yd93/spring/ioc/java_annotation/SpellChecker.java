package com.yd93.spring.ioc.java_annotation;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 14:32:58
 **/
public class SpellChecker {
    public SpellChecker(){
        System.out.println("SpellChecker内部构造方法");
    }

    public void checkSpelling(){
        System.out.println("内部checkspelling方法");
    }
}
