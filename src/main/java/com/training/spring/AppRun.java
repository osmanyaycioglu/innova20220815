package com.training.spring;

import com.training.spring.java.object.MyObject;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class AppRun {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class,
                                                                   args);
        SpringDemoApplication bean = applicationContext.getBean(SpringDemoApplication.class);
        bean.xyz();
        // Java
        System.out.println("----------------- Java Excution ------------------ ");
        MyObject myObject = new MyObject();
        String hello = myObject.hello("osman");
        System.out.println(hello);
    }

}
