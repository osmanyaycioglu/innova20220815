package com.training.spring.java;

public class ExecutionRunner {

    public void executeMe(int index){

        IExecute execute = null;
        switch (index) {
            case 1:
               execute = new ExecuteEng();
               break;
            case 2:
                execute = new ExecuteTr();
                break;
            case 3:
                execute = new ExecuteEsp();
                break;
            default:
                execute = new ExecuteEng();
                break;
        }
        execute.exec("osman");
    }

}
