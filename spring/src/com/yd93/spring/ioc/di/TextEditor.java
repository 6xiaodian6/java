package com.yd93.spring.ioc.di;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-12 11:07:48
 **/
public class TextEditor {
    private SpellChecker spellChecker;
    //这是基于构造函数的依赖注入
/*  public TextEditor(SpellChecker spellChecker){
        System.out.println("内部TextEditor的构造方法。");
        this.spellChecker = spellChecker;
    }
*/
    //这是基于设值函数的依赖注入
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("内部设值创建spellChecker");
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }
    public void spellCheck(){
        spellChecker.checkSpelling();
    }

}
