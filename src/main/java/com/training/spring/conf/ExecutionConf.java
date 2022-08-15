package com.training.spring.conf;

import com.training.spring.java.ExecuteTr;
import com.training.spring.java.IExecute;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecutionConf {

    @Bean
    public IExecute myExecutor() {
        return new ExecuteTr();
    }

    @Bean
    public ExecuteTr myExecutorTr1() {
        return new ExecuteTr();
    }

    @Bean
    public ExecuteTr myExecutorTr2() {
        return new ExecuteTr();
    }


    @Bean
    public MyOtherObject myOtherObject() {
        return new MyOtherObject("abc");
    }
}
