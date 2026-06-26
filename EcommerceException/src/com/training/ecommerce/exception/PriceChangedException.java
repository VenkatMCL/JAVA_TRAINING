package com.training.ecommerce.exception;

public class PriceChangedException extends ProductException {

    private final String errorCode = "PROD-003";

    private double oldPrice;
    private double newPrice;

    public PriceChangedException(double oldPrice,
                                 double newPrice) {

        super("Product Price Changed");

        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }
}