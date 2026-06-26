package com.training.ecommerce.exception;

public class InsufficientCreditException extends PaymentException {

    private final String errorCode = "PAY-002";

    private double required;
    private double available;

    public InsufficientCreditException(double required,
                                       double available) {

        super("Insufficient Credit");

        this.required = required;
        this.available = available;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public double getRequired() {
        return required;
    }

    public double getAvailable() {
        return available;
    }
}