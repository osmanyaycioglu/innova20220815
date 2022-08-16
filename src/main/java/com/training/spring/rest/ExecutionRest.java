package com.training.spring.rest;

import com.training.spring.java.IExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execution")
public class ExecutionRest {

    @Autowired
    @Qualifier("dynamic_execution")
    private IExecute execute;

    @GetMapping("/execute1")
    public String execute(){
        return execute.exec("exec deneme");
    }
}
