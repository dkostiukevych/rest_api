package com.pets.api.error.handling;

@SuppressWarnings("JavadocType")
public class TestException extends RuntimeException {
    
    public TestException() {
        super();
    }
    
    public TestException(String error) {
        super(error);
    }
    
}
