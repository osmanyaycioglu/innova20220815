package com.training.spring.conf;

import com.training.before.lib.MyApiConf;
import com.training.spring.java.ExecuteEng;
import com.training.spring.java.ExecuteEsp;
import com.training.spring.java.ExecuteTr;
import com.training.spring.java.IExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
@Import({MyApiConf.class})
@PropertySource("classpath:my.properties")
public class ExecutionConf {

    @Bean
    @Qualifier("dynamic_execution")
    public IExecute myExecutor3(@Value("${app.execution.className}") String className) {
        try {
            Class<?> aClass = Class.forName(className);
            IExecute execute = (IExecute) aClass.newInstance();
            return execute;
        } catch (Exception e) {
            return new ExecuteEng();
        }
    }

    //    @Value("${app.execution.language}")
//    private int languageIndex;

    @Bean
    @Qualifier("dynamic_execution_old")
    public IExecute myExecutor1(@Value("${app.execution.language}") int languageIndex,
                                @Value("${app.execution.languageStr}") String str) {
        switch (languageIndex) {
            case 2:
                return new ExecuteTr();
            case 3:
                return new ExecuteEsp();
            case 1:
            default:
                return new ExecuteEng();
        }
    }

//    @Autowired
//    private Environment environment;

    @Autowired
    private ApplicationContext appc;

    @Bean
    @Qualifier("dynamic_execution_old2")
    public IExecute myExecutor2(Environment environment) {
        Environment environment1 = appc.getEnvironment();
        Integer languageIndex = environment.getProperty("app.execution.language",
                                                    Integer.class);
        if (languageIndex == null){
            return new ExecuteEng();
        }
        switch (languageIndex) {
            case 2:
                return new ExecuteTr();
            case 3:
                return new ExecuteEsp();
            case 1:
            default:
                return new ExecuteEng();
        }
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
