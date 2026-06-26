package com.training.ecommerce.exception;

public class OrderNotFoundException extends OrderException {

    private final String errorCode = "ORD-001";

    public OrderNotFoundException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}