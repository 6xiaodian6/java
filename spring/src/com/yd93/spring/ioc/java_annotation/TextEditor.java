package com.yd93.spring.ioc.java_annotation;


/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 14:30:11
 **/
public class TextEditor {
    private SpellChecker spellChecker;
    public TextEditor(SpellChecker spellChecker){
        System.out.println("TextEditor内部构造器");
        this.spellChecker = spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
