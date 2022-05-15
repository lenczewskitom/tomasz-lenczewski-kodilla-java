package com.kodilla.testing.user;

public class SimpleUser {

    private String username;
    private String realName;

    public SimpleUser(String username, String realName) {
        this.realName = realName;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
