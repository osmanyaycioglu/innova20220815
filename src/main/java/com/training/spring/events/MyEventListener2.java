package com.training.spring.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener2 {

    @EventListener(MyEvent.class)
    public void xyz(MyEvent event) {
        System.out.println("Listener2 get event : " + event);
    }

}
