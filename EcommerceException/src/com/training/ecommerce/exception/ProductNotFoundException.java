package com.training.ecommerce.exception;

public class ProductNotFoundException extends ProductException {

    private final String errorCode = "PROD-001";

    public ProductNotFoundException(String message) {
        super(message);
    }

    public String getErrorCode() {
        return errorCode;
    }
}