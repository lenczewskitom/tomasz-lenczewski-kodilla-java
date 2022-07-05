package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private OrderService orderService;

    public OrderProcessor(OrderService orderService) {
        this.orderService = orderService;
    }
    public void processor(Data data, Order order) {
        boolean isordered = orderService.order(order);
        if (isordered) {
            switch (order.getShop()) {
                case "ExtraFoodShop" -> data.getExtraFoodShop().process(order, true);
                case "GlutenFreeShop" -> data.getGlutenFreeShop().process(order, true);
                case "HealthyShop" -> data.getHealthyShop().process(order, true);
            }
        } else {
            switch (order.getShop()) {
                case "ExtraFoodShop" -> data.getExtraFoodShop().process(order, false);
                case "GlutenFreeShop" -> data.getGlutenFreeShop().process(order, false);
                case "HealthyShop" -> data.getHealthyShop().process(order, false);
            }
        }
    }
}
