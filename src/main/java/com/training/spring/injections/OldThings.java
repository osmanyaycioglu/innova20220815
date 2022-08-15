package com.training.spring.injections;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class OldThings implements BeanNameAware, ApplicationContextAware {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean ismi : " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }
}
