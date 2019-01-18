package com.yd93.spring.ioc.application_event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 15:26:47
 **/
public class CStartEvenHandler implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("开始接收监听......");
    }
}
