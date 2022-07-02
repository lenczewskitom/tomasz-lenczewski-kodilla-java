package com.kodilla.good.patterns.challenges;

public class OrderRepository {

    public void addOrder(Order order) {
        System.out.println("Adding to datebase: \nUser: " + order.getUser().getUsername() +
                "\nProduct: " + order.getProduct().getName() + "\nValue: " + order.getProduct().getPrice() +
                "\nDate: " + order.getDateOfOrder().toString() + "\nOrder ID: " + order.getOrderID());
    }
}
