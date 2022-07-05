package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class Shops {

    Map<String, ProductsList> listOfShops = new HashMap<>();

    public void addShop(String shop, ProductsList productsList) {
        listOfShops.put(shop, productsList);
    }

    public void showShops() {

    }

    public void showAvailableProducts() {

    }

}
