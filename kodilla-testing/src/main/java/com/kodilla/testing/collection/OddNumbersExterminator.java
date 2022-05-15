package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> evenNumbers = new ArrayList<>();

    public List<Integer> exterminate(List<Integer> numbers) {

        for (Integer i: numbers) {
            if (i%2 == 0) {
                evenNumbers.add(i);
            }
        }
        return evenNumbers;
    }
}
