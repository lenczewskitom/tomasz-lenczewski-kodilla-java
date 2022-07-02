package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository, final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(Order order) {
        boolean isordered = orderService.order(order);
        if (isordered) {
            informationService.inform(order, true);
            orderRepository.addOrder(order);
            return new OrderDto(order.getUser(), true);
        }else {
            informationService.inform(order, false);
            return new OrderDto(order.getUser(), false);
        }
    }
}
