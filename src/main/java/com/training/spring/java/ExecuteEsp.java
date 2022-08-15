package com.training.spring.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
@Qualifier("xyz_esp")
public class ExecuteEsp implements IExecute {

    @Override
    public String exec(String str) {
        return "Spanish execution : " + str;
    }
}
