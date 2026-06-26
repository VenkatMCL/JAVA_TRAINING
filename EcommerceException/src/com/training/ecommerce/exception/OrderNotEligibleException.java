package com.training.ecommerce.exception;

public class OrderNotEligibleException extends OrderException {

    private final String errorCode = "ORD-003";

    public OrderNotEligibleException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}