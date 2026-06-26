package com.training.ecommerce.exception;

public class OrderAlreadyCancelledException extends OrderException {

    private final String errorCode = "ORD-002";

    public OrderAlreadyCancelledException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}