package com.kodilla.good.patterns.food2door;

import java.util.Scanner;

public class OrderCreator {

    Scanner scanner = new Scanner(System.in);
    private String shop;
    private String productName;
    private Product product;
    private int quantity;
    public Order order(Data data) {
        User user = new User("Jan", "Kowalski", "jkowalski",
                "jkowalski@gmail.com", "Wschodnia 9, Warszawa");

        System.out.println("Select shop from the list: ");
        data.shopsList().listOfShops.entrySet().stream()
                        .forEach(entry -> System.out.println(entry.getKey()));
        shop = scanner.nextLine();
        System.out.println("Select products from the list");
        switch (shop) {
            case "ExtraFoodShop" -> data.extraFoodShopProducts().listOfProducts.forEach(System.out::println);
            case "HealthyShop" -> data.healthyShopProducts().listOfProducts.forEach(System.out::println);
            case "GlutenFreeShop" -> data.glutenFreeShopProducts().listOfProducts.forEach(System.out::println);
        }
        productName = scanner.nextLine();
        product = switch (productName) {
            case "Bread" -> data.extraFoodShopProducts().listOfProducts.get(0);
            case "Butter" -> data.extraFoodShopProducts().listOfProducts.get(1);
            case "Water" -> data.healthyShopProducts().listOfProducts.get(0);
            case "Juice" -> data.healthyShopProducts().listOfProducts.get(1);
            case "Apple" -> data.glutenFreeShopProducts().listOfProducts.get(0);
            case "Potato" -> data.glutenFreeShopProducts().listOfProducts.get(1);
            default -> null;
        };
        System.out.println("Enter quantity: ");
        quantity = scanner.nextInt();

        return new Order(user, product, quantity, shop);
    }
}
