package com.turfbookingcustomerservice.exception;

public enum ErrorCode {

    BAD_REQUEST("INVALID_REQUEST");

    private final String name;

    ErrorCode(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
