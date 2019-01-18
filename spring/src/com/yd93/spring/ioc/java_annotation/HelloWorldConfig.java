package com.yd93.spring.ioc.java_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 13:38:15
 **/
// <beans><bean id="helloWorld" class="HelloWorld"/></beans>在XML文件中的这个配置就等同于下面的这个配置
@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}

