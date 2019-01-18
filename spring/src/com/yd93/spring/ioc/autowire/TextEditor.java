package com.yd93.spring.ioc.autowire;


/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-12 17:13:01
 **/
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(SpellChecker spellChecker,String name){
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
