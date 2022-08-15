package com.training.spring.java.object;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component

//@Controller
//@Repository
//@Service
//@Configuration
// @Scope("prototype")
public class MyObject {

    private int counter = 0;

    public String hello(String name){
        return "Hello " + name + " - " +  counter++ ;
    }

}


