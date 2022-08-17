package com.training.spring.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyStarter implements CommandLineRunner {

    @Autowired
    private MyEventPublisher publisher;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Event publish ediliyor.");
        publisher.publishEvent();
    }

}
