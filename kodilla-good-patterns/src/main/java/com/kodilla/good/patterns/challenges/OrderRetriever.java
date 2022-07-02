package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRetriever {

    public Order retrieve(){
        User user = new User("Piotr", "Kowalski", "pkowalski", "pkowalski@gmail.com");
        Product product = new Product("Laptop", 4000);
        int orderID = 1;
        LocalDateTime dateOfOrder = LocalDateTime.of(2022, 06, 29, 11, 00);

        return new Order(user, product, orderID, dateOfOrder);
    }
}
