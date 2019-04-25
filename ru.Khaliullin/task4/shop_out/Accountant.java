package task4.shop_out;

import task4.shop.Person;

public class Accountant extends Person {
    private String[ ] subordinateList;
    private String[ ] responsibility;
    private int salary;
    private String[ ] taxpayerIdentificationNumberList;

    public Accountant(String firstName, String lastName, int identificationNumber) {
        super(firstName, lastName, identificationNumber);
    }

    public String[] getSubordinateList() {
        return subordinateList;
    }

    public void setSubordinateList(String[] subordinateList) {
        this.subordinateList = subordinateList;
    }

    public String[] getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String[] responsibility) {
        this.responsibility = responsibility;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String[] getTaxpayerIdentificationNumberList() {
        return taxpayerIdentificationNumberList;
    }

    public void setTaxpayerIdentificationNumberList(String[] taxpayerIdentificationNumberList) {
        this.taxpayerIdentificationNumberList = taxpayerIdentificationNumberList;
    }
}
