package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isCompleted;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        isCompleted = false;
    }

    @Override
    public void executeTask() {
        isCompleted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isCompleted;
    }
}
