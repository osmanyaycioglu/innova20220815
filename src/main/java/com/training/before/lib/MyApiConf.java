package com.training.before.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApiConf {

    @Bean
    public MyApi myApi(){
        return new MyApi();
    }

}
