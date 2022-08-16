package com.training.spring.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Qualifier("xyz_eng")
public class ExecuteEng implements IExecute {

    @Override
    public String exec(String str) {
        return "English execution : " + str;
    }
}
