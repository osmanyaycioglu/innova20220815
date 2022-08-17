package com.training.spring.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void publishEvent() {
        MyEvent myEvent = new MyEvent(this);
        myEvent.setMessage("deneme mesajı");
        myEvent.setPort(1000);
        this.eventPublisher.publishEvent(myEvent);
        System.out.println("test");
    }
}
