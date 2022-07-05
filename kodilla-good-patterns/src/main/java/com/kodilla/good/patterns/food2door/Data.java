package com.kodilla.good.patterns.food2door;

public class Data {

    private ProductsList extraFoodShopProducts;
    private ProductsList glutenFreeShopProducts;
    private ProductsList healthyShopProducts;
    private Shops shops;
    private ExtraFoodShop extraFoodShop;
    private GlutenFreeShop glutenFreeShop;
    private HealthyShop healthyShop;

    public Data() {

        extraFoodShopProducts = new ProductsList();
        glutenFreeShopProducts = new ProductsList();
        healthyShopProducts = new ProductsList();

        extraFoodShopProducts.addNewProduct(new Product("Bread", 10.00));
        extraFoodShopProducts.addNewProduct(new Product("Butter", 10.00));

        glutenFreeShopProducts.addNewProduct(new Product("Apple", 2.50));
        glutenFreeShopProducts.addNewProduct(new Product("Potato", 1.00));

        healthyShopProducts.addNewProduct(new Product("Water", 2.50));
        healthyShopProducts.addNewProduct(new Product("Juice", 4.00));

        shops = new Shops();
        shops.addShop("ExtraFoodShop", extraFoodShopProducts);
        shops.addShop("GlutenFreeShop", glutenFreeShopProducts);
        shops.addShop("HealthyShop", healthyShopProducts);

        extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "Klonowa 3, Lublin");
        glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "Zachodnia 44, KAtowice");
        healthyShop = new HealthyShop("HealthyShop", "Lipowa 12, Radom");
    }

    public ProductsList extraFoodShopProducts() {
        return extraFoodShopProducts;
    }

    public ProductsList glutenFreeShopProducts() {
        return glutenFreeShopProducts;
    }

    public ProductsList healthyShopProducts() {
        return healthyShopProducts;
    }

    public Shops shopsList() {
        return shops;
    }

    public ExtraFoodShop getExtraFoodShop() {
        return extraFoodShop;
    }

    public GlutenFreeShop getGlutenFreeShop() {
        return glutenFreeShop;
    }

    public HealthyShop getHealthyShop() {
        return healthyShop;
    }
}
