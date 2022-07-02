package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Order {
    private User user;
    private Product product;
    private int orderID;
    private LocalDateTime dateOfOrder;

    public Order(final User user, final Product product, final int orderID, final LocalDateTime dateOfOrder) {
        this.user = user;
        this.product = product;
        this.orderID = orderID;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderID() { return orderID; }

    public LocalDateTime getDateOfOrder() {
        return dateOfOrder;
    }
}
