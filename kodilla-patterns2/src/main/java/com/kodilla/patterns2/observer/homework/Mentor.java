package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }
    @Override
    public void update(Queue queue) {
        System.out.println(username + ": New messages in topic " + queue.getName() + "\n" +
                " (total: " + queue.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
