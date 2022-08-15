package com.training.spring.rest;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.training.spring.java.IExecute;
import com.training.spring.java.object.MyObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

//@Controller
//@ResponseBody

@RestController
@RequestMapping("/test/inject")
// @RequestScope
public class TestInjection {

    public TestInjection() {
        System.out.println("TestInjection yaratıldı");
    }

    @Autowired
    @Qualifier("xyz_esp")
    private IExecute execute;

    @Autowired
    private MyObject mObject;

    @Autowired
    private MyObject mObject2;

    @Autowired
    private List<IExecute> executes;

    // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String hello() {
        return mObject.hello("osman") + " " + mObject2.hello("ali");
    }

    @PostMapping("/hello")
    public String helloPost() {
        return "hello post";
    }

    @GetMapping("/execute")
    public String execute() {
        return execute.exec("osman");
    }

    @GetMapping("/executes")
    public String executes() {
        return executes.toString();
    }

}
