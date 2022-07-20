package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void TestShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.ShoppingTask);
        shoppingTask.executeTask();
        //Then
        assertEquals("Shopping Task 1", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    void TestPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PaintingTask);
        paintingTask.executeTask();
        //Then
        assertEquals("Painting Task 1", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void TestDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DrivingTask);
        drivingTask.executeTask();
        //Then
        assertEquals("Driving Task 1", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
}
