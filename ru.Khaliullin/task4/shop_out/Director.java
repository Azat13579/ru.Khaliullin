package task4.shop_out;


import task4.shop.Person;

public class Director extends Person {
    private String[ ] subordinateList;
    private String[ ] responsibility;

   public Director(String firstName, String lastName, int identificationNumber) {
        super(firstName, lastName, identificationNumber);
    }
}
