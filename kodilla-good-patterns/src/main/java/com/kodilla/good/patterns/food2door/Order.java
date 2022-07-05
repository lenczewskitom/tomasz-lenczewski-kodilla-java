package com.kodilla.good.patterns.food2door;

public class Order {

    private User user;
    private Product product;
    private int quantity;
    private String shop;

    public Order(User user, Product product, int quantity, String shop) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }


    public int getQuantity() {
        return quantity;
    }

    public String getShop() {
        return shop;
    }
}
