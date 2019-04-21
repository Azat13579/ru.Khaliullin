package task4.shop;

import task4.shop.Cashier;

import java.util.Arrays;

public class SalesDepartment {
    private Cashier[] cashiers = new Cashier[7];

    Cashier[] getCashiers(Cashier[] cashiers) {
        return this.cashiers;
    }

     void setCashiers(Cashier[] cashiers) {
        this.cashiers = cashiers;
    }

    @Override
    public String toString() {
        return "SalesDepartment{" +
                "cashiers=" + Arrays.toString(cashiers) +
                '}';
    }
}
