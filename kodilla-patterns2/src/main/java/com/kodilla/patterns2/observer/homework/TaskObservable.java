package com.kodilla.patterns2.observer.homework;

public interface TaskObservable {
    void registerObserver(TaskObserver observer);
    void removeObserver(TaskObserver observer);
    void notifyObservers();
}
