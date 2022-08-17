package com.training.spring.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonCreateResponse {

    private String message;
    private int cause;

    public PersonCreateResponse() {
    }

    public PersonCreateResponse(String message,
                                int cause) {
        this.message = message;
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public PersonCreateResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public int getCause() {
        return cause;
    }

    public PersonCreateResponse setCause(int cause) {
        this.cause = cause;
        return this;
    }
}
