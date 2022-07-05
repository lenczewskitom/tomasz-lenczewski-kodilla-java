package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Process {
    private String name;
    private String address;

    public ExtraFoodShop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void process(Order order, boolean isOrdered) {
        if (isOrdered) {
            System.out.println("Welcome in ExtraFoodShop\nYour order has been accepted\nOrdered product: "
                    + order.getProduct().getName() + "\nQuantity: " + order.getQuantity() + "\nTotal value: "
                    + (order.getQuantity()*order.getProduct().getPrice()));
        } else {
            System.out.println("Welcome in GlutenFreeShop\nUnfortunately your order has been rejected.");
        }
    }
}
