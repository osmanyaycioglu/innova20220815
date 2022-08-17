package com.training.spring.events;


import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    private String message;
    private int port;

    public MyEvent(Object source) {
        super(source);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "MyEvent{" +
                "message='" + message + '\'' +
                ", port=" + port +
                '}';
    }
}
