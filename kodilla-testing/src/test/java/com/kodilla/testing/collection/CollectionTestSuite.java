package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Collection Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Collection Test Suite: end");
    }


    @DisplayName("when send List<Integer> with integers, " +
            "then exterminate should return even numbers"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>(Arrays.asList());
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assertions.assertEquals((Arrays.asList()),result);
    }

    @DisplayName("when send empty List<Integer> , " +
            "then exterminate should return empty collection"
    )

    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assertions.assertEquals((Arrays.asList(2,4,6,8)),result);
    }
}
