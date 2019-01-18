package com.yd93.spring.ioc.java_annotation;

import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 14:27:24
 **/
public class TextEditorConfig {

    @Bean
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
