package com.kodilla.good.patterns.food2door;

public class User {
    private String firstName;
    private String surname;
    private String username;
    private String email;
    private String address;

    public User(String firstName, String surname, String username, String email, String address) {
        this.firstName = firstName;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.address = address;
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

    public String getAddress() {
        return address;
    }
}
