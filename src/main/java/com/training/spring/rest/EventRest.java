package com.training.spring.rest;

import com.training.spring.events.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/event")
public class EventRest {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    // /event/send?msg=test mesaji&port=2000
    @GetMapping("/send")
    public String sendEvent(@RequestParam("msg") String message,
                            @RequestParam("port") int port) {
        MyEvent myEvent = new MyEvent(this);
        myEvent.setMessage(message);
        myEvent.setPort(port);
        this.eventPublisher.publishEvent(myEvent);
        return "Message sent.";
    }

    // /event/send2/mesaj1/2000
    @GetMapping("/send2/{abc}/{xyz}")
    public String sendEvent2(@PathVariable("abc") String message,
                             @PathVariable("xyz") int port) {
        MyEvent myEvent = new MyEvent(this);
        myEvent.setMessage(message);
        myEvent.setPort(port);
        this.eventPublisher.publishEvent(myEvent);
        return "Message sent2.";
    }

    // /event/send3/2000?msg=mesaj1
    @GetMapping("/send3/{abc}")
    public String sendEvent3(@RequestParam("msg") String message,
                             @PathVariable("abc") int port) {
        MyEvent myEvent = new MyEvent(this);
        myEvent.setMessage(message);
        myEvent.setPort(port);
        this.eventPublisher.publishEvent(myEvent);
        return "Message sent3.";
    }

}
