package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {

    public static final String ShoppingTask = "ShoppingTask";
    public static final String PaintingTask = "PaintingTask";
    public static final String DrivingTask = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case ShoppingTask:
                return new ShoppingTask("Shopping Task 1", "Butter", 2);
            case PaintingTask:
                return new PaintingTask("Painting Task 1", "Red", "Car");
            case DrivingTask:
                return new DrivingTask("Driving Task 1", "Work", "Taxi");
            default:
                return null;
        }
    }
}
