package com.marinho.springbootboilerplate.controller;

import com.marinho.springbootboilerplate.model.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final String HELLO_WORLD_MESSAGE = "Hello, World!";

    @GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
    public Message message(){
        return new Message(HELLO_WORLD_MESSAGE);
    }
}
