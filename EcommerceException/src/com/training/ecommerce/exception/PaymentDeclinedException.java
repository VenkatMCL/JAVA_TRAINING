package com.training.ecommerce.exception;

public class PaymentDeclinedException extends PaymentException {

    private final String errorCode = "PAY-001";

    private String reason;

    public PaymentDeclinedException(String reason) {

        super("Payment Declined");

        this.reason = reason;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getReason() {
        return reason;
    }
}