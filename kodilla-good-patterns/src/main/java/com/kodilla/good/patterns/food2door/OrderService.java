package com.kodilla.good.patterns.food2door;


public class OrderService {

    public boolean order(Order order) {
        System.out.println("Ordered product: " + order.getProduct().getName() + " Quantity: " +
                order.getQuantity() + ", User: " + order.getUser().getUsername());
        return true;
    }
}
