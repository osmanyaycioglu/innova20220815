package com.training.spring.injections;

import com.training.spring.java.IExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyAppRunner implements ApplicationRunner {

    private IExecute execute1;

    // Field Injection
    @Autowired
    @Qualifier("xyz_esp")
    private IExecute execute2;

    private IExecute execute3;

    // Constructor Injection
    @Autowired // optional
    public MyAppRunner(@Qualifier("xyz_esp") IExecute execute) {
        // Initial
        this.execute1 = execute;
    }

    public MyAppRunner(@Qualifier("xyz_esp") IExecute execute,
                       String str,
                       int intVal) {
        // Initial
        this.execute1 = execute;
    }

    // Bean lifecycle
    @PostConstruct
    public void abcInit() {
        // Initial
    }

    // Bean lifecycle
    @PreDestroy
    public void abcDestroy() {
        System.out.println("pre destroy");
        // Destroy
    }

    // Method Injection
    @Autowired
    public void abc(@Qualifier("xyz_esp") IExecute execute) {
        this.execute3 = execute;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(execute1.exec("exec1"));
        System.out.println(execute2.exec("exec2"));
        System.out.println(execute3.exec("exec3"));
    }
}
