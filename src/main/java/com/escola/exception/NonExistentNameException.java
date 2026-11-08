package com.escola.exception;

public class NonExistentNameException extends RuntimeException {
    public NonExistentNameException(String message) {
        super(message);
    }
}