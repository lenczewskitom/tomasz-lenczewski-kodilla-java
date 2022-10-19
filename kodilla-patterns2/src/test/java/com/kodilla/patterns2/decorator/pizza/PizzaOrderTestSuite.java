package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Ingredients: dough, cheese, tomato sauce", description);
    }

    @Test
    public void testPineapplePizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(19), calculatedCost);
    }

    @Test
    public void testPineapplePizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Ingredients: dough, cheese, tomato sauce, pineapple", description);
    }

    @Test
    public void testThreeIngredientsPizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChampignonsDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(23), calculatedCost);
    }

    @Test
    public void testThreeIngredientsPizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ChampignonsDecorator(pizzaOrder);
        pizzaOrder = new OlivesDecorator(pizzaOrder);
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Ingredients: dough, cheese, tomato sauce, champignons, olives, salami", description);
    }

    @Test
    public void testExtraCheesePizzaOrderGetCost() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        // When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        // Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testExtraCheesePizzaOrderGetDescription() {
        // Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        // When
        String description = pizzaOrder.getDescription();
        // Then
        assertEquals("Ingredients: dough, cheese, tomato sauce, pineapple, extra cheese", description);
    }
}
