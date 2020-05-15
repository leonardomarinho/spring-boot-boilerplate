package com.marinho.springbootboilerplate.model;

import javax.validation.constraints.NotNull;

public class Message {
    @NotNull(message = "Message cannot be null")
    private String message;

    public String getMessage() { return message; }
    public void setMessage(String message) {
        this.message = message;
    }
}
