package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculatorAdd = new Calculator();
        Calculator calculatorSubtract = new Calculator();

        Integer addResult = calculatorAdd.add(6,10);
        Integer subtractResult = calculatorSubtract.subtract(20,5);

        if (addResult.equals(16) && subtractResult.equals(15)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
