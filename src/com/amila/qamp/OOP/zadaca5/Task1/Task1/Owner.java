package com.amila.qamp.OOP.zadaca5.Task1.Task1;

public class Owner {
    private String firstName;
    private String lastName;
    private String address;

    protected Owner(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "{" + firstName + "}" + "{" + lastName + "}" + "{" + address + "}";
    }
}
