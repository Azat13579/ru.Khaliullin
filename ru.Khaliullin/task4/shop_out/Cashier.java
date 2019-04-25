package task4.shop_out;

import task4.shop.Person;

public class Cashier extends Person {
    private String responsibility;
    private String productList;
    private int salary;

    public Cashier(String firstName, String lastName, int identificationNumber) {
        super(firstName, lastName, identificationNumber);
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
