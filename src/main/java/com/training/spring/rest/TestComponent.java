package com.training.spring.rest;

import com.training.before.lib.MyApi;
import com.training.before.lib.MyApiConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/com")
public class TestComponent {

    private MyApi myApi;

    public TestComponent(MyApi myApi) {
        this.myApi = myApi;
    }

    @GetMapping("/test1")
    public String test1() {
        return myApi.myMethod(10);
    }

}
