package com.marinho.springbootboilerplate.controller;

import com.marinho.springbootboilerplate.model.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello-world")
public class HelloWorldController {

    private static final String HELLO_WORLD_MESSAGE = "Hello, World!";

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Message message(){
        var createdMessage = new Message();
        createdMessage.setMessage(HELLO_WORLD_MESSAGE);
        return createdMessage;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Message> somePostMethod(@RequestBody Message message) {
        var createdMessage = new Message();
        createdMessage.setMessage("HEY, you posted ".concat(message.getMessage()));
        return new ResponseEntity<Message>(createdMessage, HttpStatus.OK);
    }
}
