package com.yd93.spring.ioc.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-15 11:03:46
 **/
@Component
public class User {
    @Autowired
    private Save save;
    private String name;

    public void setSave(Save save) {
        this.save = save;
    }
    public void setName(String name) {
        this.name = "加载文件成功";
    }

    public String getName() {
        return name;
    }
    public void fun(){
        save.useSave();
        System.out.println("数据加载成功了，恭喜你了");
    }
}
