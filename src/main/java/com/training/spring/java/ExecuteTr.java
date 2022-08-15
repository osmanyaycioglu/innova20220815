package com.training.spring.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("xyz_tr")
public class ExecuteTr implements IExecute {

    @Override
    public String exec(String str) {
        return "Türkçe çalıştırdım : " + str;
    }
}
