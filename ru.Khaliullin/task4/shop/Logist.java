package task4.shop;

import task4.shop.Person;

public class Logist extends Person {
    private String subordinateList;
    private String responsibility;
    private int salary;

    /*public Logist(String firstName, String lastName, int identificationNumber) {
        super(firstName, lastName, identificationNumber);
    }*/

    public Logist(String firstName, String lastName, int identificationNumber) {
        super(firstName, lastName, identificationNumber);
    }

    public String getSubordinateList() {
        return subordinateList;
    }

    public void setSubordinateList(String subordinateList) {
        this.subordinateList = subordinateList;
    }

    public String getResponsibility(String s) {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    int getSalary() {
        return salary;
    }

     void setSalary(int salary) {
        this.salary = salary;
    }


}
