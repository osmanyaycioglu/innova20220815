package com.training.spring.conf;

import com.training.spring.java.ExecuteEng;
import com.training.spring.java.ExecuteTr;
import com.training.spring.java.IExecute;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("turkish")
@Configuration
public class ExecutionTurkishConfig {
    @Bean
    public IExecute dynExecution(@Value("${app.user.name}") String name) {
        System.out.println(name);
        return new ExecuteTr();
    }
}
