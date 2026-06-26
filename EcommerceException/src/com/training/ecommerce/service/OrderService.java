package com.training.ecommerce.service;

import com.training.ecommerce.exception.*;

public class OrderService {

    public void findOrder(int orderId)
            throws OrderNotFoundException {

        throw new OrderNotFoundException(
                "Order " + orderId + " not found");
    }

    public void cancelOrder()
            throws OrderAlreadyCancelledException {

        throw new OrderAlreadyCancelledException(
                "Order already cancelled");
    }

    public void returnOrder()
            throws OrderNotEligibleException {

        throw new OrderNotEligibleException(
                "Order is not eligible for return");
    }

    public void checkStock()
            throws OutOfStockException {

        throw new OutOfStockException(
                "P101",
                10,
                2);
    }

    public void checkPrice()
            throws PriceChangedException {

        throw new PriceChangedException(
                999.0,
                1199.0);
    }

    public void makePayment()
            throws PaymentDeclinedException {

        throw new PaymentDeclinedException(
                "Card Expired");
    }

    public void checkCredit()
            throws InsufficientCreditException {

        throw new InsufficientCreditException(
                10000,
                5000);
    }
}