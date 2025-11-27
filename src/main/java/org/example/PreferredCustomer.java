package org.example;

public class PreferredCustomer extends Customer {

    private int loyaltyPoints;
    private double discountLevel; // fraction, e.g. 0.05 = 5%

    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber,
                             boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    private void updateDiscountLevel() {
        if (loyaltyPoints < 500) {
            discountLevel = 0.00;
        } else if (loyaltyPoints <= 999) { // 500–999
            discountLevel = 0.05;
        } else if (loyaltyPoints <= 1499) { // 1000–1499
            discountLevel = 0.06;
        } else if (loyaltyPoints <= 1999) { // 1500–1999
            discountLevel = 0.07;
        } else { // >= 2000
            discountLevel = 0.10;
        }
    }
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }
    public double getDiscountLevel() {
        return discountLevel;
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}

