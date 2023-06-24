package com.niraj.app.exception;

public class ApplicationNotFoundException extends RuntimeException {

    public ApplicationNotFoundException(String exception) {
        super(exception);
    }
}
