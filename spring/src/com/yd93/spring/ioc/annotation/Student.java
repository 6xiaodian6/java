package com.yd93.spring.ioc.annotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 09:22:30
 **/
public class Student {
    private Integer age;
    private String name;

    public Integer getAge() {
        return age;
    }
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
}
