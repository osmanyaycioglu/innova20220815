package com.training.spring.java.object;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("singleObj")
@Lazy
public class MySingleton {

    public MySingleton() {
        System.out.println("MySingleton yaratıldı .....***---");
    }

    public void test(){
        System.out.println("test");
    }

}
