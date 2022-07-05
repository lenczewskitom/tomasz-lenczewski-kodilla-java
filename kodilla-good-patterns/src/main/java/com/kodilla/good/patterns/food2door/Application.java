package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        Data data = new Data();
        OrderCreator orderCreator = new OrderCreator();
        Order order = orderCreator.order(data);
        OrderProcessor orderProcessor = new OrderProcessor(new OrderService());
        orderProcessor.processor(data, order);
    }
}
