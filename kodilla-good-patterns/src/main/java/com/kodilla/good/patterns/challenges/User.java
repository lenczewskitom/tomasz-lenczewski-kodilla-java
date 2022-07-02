package com.kodilla.good.patterns.challenges;

public class User {
    private String firstName;
    private String surname;
    private String username;
    private String email;

    public User(String firstName, String surname, String username, String email) {
        this.firstName = firstName;
        this.surname = surname;
        this.username = username;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
