package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Queue implements TaskObservable {

    private final List<String> messages;
    private final String name;
    private final List<TaskObserver> taskObservers;

    public Queue(String name) {
        taskObservers = new ArrayList<>();
        messages = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        messages.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(TaskObserver taskObserver) {
        taskObservers.add(taskObserver);
    }

    @Override
    public void removeObserver(TaskObserver taskObserver) {

    }

    @Override
    public void notifyObservers() {
        for (TaskObserver taskObserver: taskObservers) {
            taskObserver.update(this);
        }
    }
    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }

}
