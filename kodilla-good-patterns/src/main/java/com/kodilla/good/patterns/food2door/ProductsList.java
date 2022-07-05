package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProductsList {
    List<Product> listOfProducts = new ArrayList<>();

    public void addNewProduct(Product product) {
        listOfProducts.add(product);
    }
}
