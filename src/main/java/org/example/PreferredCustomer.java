package org.example;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.
    // constructors, methods, getters, setters, toString()
    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }
    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }
    private void DiscountLevel
}
