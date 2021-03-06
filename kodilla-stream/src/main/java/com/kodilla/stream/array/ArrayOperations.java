package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        double averageOfNumbers;

        if (numbers.length != 0) {
            averageOfNumbers = IntStream.range(0, numbers.length)
                    .mapToDouble(n -> numbers[n])
                    .average()
                    .getAsDouble();
        } else averageOfNumbers = 0;

        return averageOfNumbers;
    }
}
