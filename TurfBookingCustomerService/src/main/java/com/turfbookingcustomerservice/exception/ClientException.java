package com.turfbookingcustomerservice.exception;

public class ClientException extends RuntimeException {

    private final String message;

    public ClientException(String msg) {
        super(msg);
        this.message = msg;
    }
}
