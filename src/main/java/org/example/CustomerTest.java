package org.example;

public class CustomerTest {
    public static void main(String[] args) {
        // parameterised constructor
        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true
        );

        Customer part2Customer = new Customer();
        part2Customer.setName("Stephen Duffy");
        part2Customer.setAddress("Galway");
        part2Customer.setPhoneNumber("67676767");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        System.out.println(part1Customer);
        System.out.println(part2Customer);
    }
}

