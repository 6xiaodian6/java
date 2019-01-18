package com.yd93.spring.ioc.annotation;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 09:37:39
 **/
public class SpellChecker {
    public SpellChecker(){
        System.out.println("被依赖的SpellChecker内部构造方法");
    }
    public void checkSpelling(){
        System.out.println("被依赖的内部checkSpelling方法");
    }
}
