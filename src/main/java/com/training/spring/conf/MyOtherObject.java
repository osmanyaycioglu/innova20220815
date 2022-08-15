package com.training.spring.conf;

import org.springframework.stereotype.Component;

// @Component
public class MyOtherObject {

    private String prefix;

    public MyOtherObject(String prefix) {
        this.prefix = prefix;
    }

    public String doSomething(){
        return prefix + "-" + "I did it";
    }

}
