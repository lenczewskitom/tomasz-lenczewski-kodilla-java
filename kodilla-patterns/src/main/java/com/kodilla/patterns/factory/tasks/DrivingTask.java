package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private boolean isCompleted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
