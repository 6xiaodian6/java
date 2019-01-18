package com.yd93.spring.ioc.application_event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-14 15:31:25
 **/
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("停止监听");
    }
}
