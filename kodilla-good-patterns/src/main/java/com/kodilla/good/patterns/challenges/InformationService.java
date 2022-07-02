package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class InformationService {

    public void inform(Order order, boolean isOrdered) {
        if (isOrdered) {
            System.out.println("Hello " + order.getUser().getFirstName() + " " + order.getUser().getSurname() +
                    ".\nYour order of " + order.getDateOfOrder() + " has been accepted.\n" +
                    "Products: " + order.getProduct().getName() + "\nValue: " + order.getProduct().getPrice());
        } else {
            System.out.println("Hello " + order.getUser().getFirstName() + " " + order.getUser().getSurname() +
                    ".\n Your order of " + order.getDateOfOrder() + " has been rejected.");
        }

    }
}
