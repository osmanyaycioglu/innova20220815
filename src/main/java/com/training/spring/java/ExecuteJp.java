package com.training.spring.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("xyz_eng")
public class ExecuteJp implements IExecute {

    @Override
    public String exec(String str) {
        return "Japan execution : " + str;
    }
}
