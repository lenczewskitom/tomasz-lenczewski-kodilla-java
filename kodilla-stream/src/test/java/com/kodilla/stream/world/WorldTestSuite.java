package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("50000000")));
        europe.addCountry(new Country("Spain", new BigDecimal("80000000")));
        europe.addCountry(new Country("France", new BigDecimal("100000000")));

        asia.addCountry(new Country("China", new BigDecimal("1000000000")));
        asia.addCountry(new Country("Japan", new BigDecimal("60000000")));
        asia.addCountry(new Country("Indonesia", new BigDecimal("240000000")));

        africa.addCountry(new Country("Nigeria", new BigDecimal("200000000")));
        africa.addCountry(new Country("Ethiopia", new BigDecimal("100000000")));
        africa.addCountry(new Country("Egypt", new BigDecimal("80000000")));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        //When
        BigDecimal peopleQantity = BigDecimal.ZERO;
        peopleQantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("1950000000");
        assertEquals(expectedQuantity, peopleQantity);
    }
}
