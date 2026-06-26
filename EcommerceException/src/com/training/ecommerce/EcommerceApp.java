package com.training.ecommerce;

import com.training.ecommerce.exception.*;
import com.training.ecommerce.service.OrderService;

public class EcommerceApp {

    public static void main(String[] args) {

        OrderService service = new OrderService();

        try {

            service.checkStock();

        } catch (OutOfStockException e) {

            System.out.println("Error Code : "
                    + e.getErrorCode());

            System.out.println("Product Id : "
                    + e.getProductId());

            System.out.println("Requested Qty : "
                    + e.getRequestedQty());

            System.out.println("Available Qty : "
                    + e.getAvailableQty());
        }
    }
}