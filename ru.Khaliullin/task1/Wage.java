package ru.Khaliullin.task1;

public class Wage {
    public static void main(String args[]){
        double tax = 0.13;
        int wageAndTax = 70000;
        double wage = wageAndTax - (wageAndTax*tax);
        System.out.println(wage);

    }
}
