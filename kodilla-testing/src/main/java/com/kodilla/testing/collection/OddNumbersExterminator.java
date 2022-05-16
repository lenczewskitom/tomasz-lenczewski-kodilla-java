package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer i: numbers) {
            if (i%2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
