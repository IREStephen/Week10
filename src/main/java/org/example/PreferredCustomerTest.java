package org.example;

public class PreferredCustomerTest {
    public static void main(String[] args) {
        PreferredCustomer pc = new PreferredCustomer();
        pc.setName("Charlie Customer");
        pc.setAddress("3 Middle Road");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        System.out.println("Before points: " + pc);

        pc.addLoyaltyPoints(700);
        System.out.println("After +700 points: " + pc);

        pc.addLoyaltyPoints(800);
        System.out.println("After +800 points (total +1500): " + pc);
    }
}

