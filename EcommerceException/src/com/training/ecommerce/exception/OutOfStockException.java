package com.training.ecommerce.exception;

public class OutOfStockException extends ProductException {

    private final String errorCode = "PROD-002";

    private String productId;
    private int requestedQty;
    private int availableQty;

    public OutOfStockException(String productId,
                               int requestedQty,
                               int availableQty) {

        super("Product Out Of Stock");

        this.productId = productId;
        this.requestedQty = requestedQty;
        this.availableQty = availableQty;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getProductId() {
        return productId;
    }

    public int getRequestedQty() {
        return requestedQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }
}