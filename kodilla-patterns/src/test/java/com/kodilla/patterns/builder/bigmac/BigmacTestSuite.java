package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testNewBigmac() {
        //Given
        Bigmac bigmac =new Bigmac.BigmacBuilder()
                .bun("No sesame")
                .burgers(2)
                .ingredient("Salad")
                .ingredient("Cheese")
                .ingredient("Onion")
                .sauce("Spicy")
                .build();
        System.out.println(bigmac);
        //When
        int ingredientsNumber = bigmac.getIngredients().size();
        //Then
        assertEquals(3, ingredientsNumber);
    }
}
