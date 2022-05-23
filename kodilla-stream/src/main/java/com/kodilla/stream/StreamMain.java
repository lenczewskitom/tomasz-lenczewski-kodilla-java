package com.kodilla.stream;

import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.MathExpression;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
    ExpressionExecutor expressionExecutor = new ExpressionExecutor();
    expressionExecutor.executeExpression(10, 5, (a, b) -> a+b);

    expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
    }
}