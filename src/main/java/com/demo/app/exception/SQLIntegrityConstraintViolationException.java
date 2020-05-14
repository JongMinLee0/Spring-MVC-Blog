package com.demo.app.exception;

public class SQLIntegrityConstraintViolationException extends RuntimeException {

    public SQLIntegrityConstraintViolationException() {
    }

    public SQLIntegrityConstraintViolationException(String message) {
        super(message);
    }
}
