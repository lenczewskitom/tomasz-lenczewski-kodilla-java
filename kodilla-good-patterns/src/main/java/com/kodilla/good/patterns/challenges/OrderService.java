package com.kodilla.good.patterns.challenges;

public class OrderService {
    public boolean order(Order order) {
        System.out.println("Ordered product: " + order.getProduct().getName() + ", User: " +
                order.getUser().getUsername() + ", Order ID: " + order.getOrderID());
        return true;
    }
}
