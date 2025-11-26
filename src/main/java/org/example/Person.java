package org.example;

import java.security.PublicKey;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person() {
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
