package com.yd93.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 10:38:16
 **/
public class TextEditor {

    //@Autowired
    private SpellChecker spellChecker;

    @Autowired//@Autowired(required=false)使用Autowired注解时有两个方式一个是带ruquired参数的一个是不带的，默认不带的是required的值是true，即必须有参数传递，false就是可以不传递参数
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
