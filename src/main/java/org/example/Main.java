package org.example;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Stephen", "Corrandulla", "12345");
        System.out.println(person.toString());

        Customer myCustomer = new Customer("Stephen", "Corrandulla", "12345", 12, true);
        System.out.println(myCustomer.toString());

        Customer customer = new Customer();
    }
}
