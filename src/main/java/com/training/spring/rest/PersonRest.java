package com.training.spring.rest;

import com.training.spring.common.Person;
import com.training.spring.events.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonRest {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    @Value("${server.port}")
    private int port;

    @PostMapping("/create")
    public PersonCreateResponse createPerson(@Validated @RequestBody Person person) {
        // Person creation
        MyEvent myEvent = new MyEvent(this);
        myEvent.setMessage(person.toString() + " created.");
        myEvent.setPort(port);
        eventPublisher.publishEvent(myEvent);
        return new PersonCreateResponse().setMessage("created successfully")
                                         .setCause(100);
    }

    @PostMapping(value = "/create2", consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    // @PostMapping("/create")
    public PersonCreateResponse createPerson2(@RequestBody Person person) {
        // Person creation
//        if (person.getName() == null) {
//            throw new IllegalArgumentException("person ın ismi boş olamaz");
//        }
        MyEvent myEvent = new MyEvent(this);
        myEvent.setMessage(person.toString() + " created.");
        myEvent.setPort(port);
        eventPublisher.publishEvent(myEvent);
        return new PersonCreateResponse().setMessage("created successfully")
                                         .setCause(100);
    }
}
