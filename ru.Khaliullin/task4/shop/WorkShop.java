package task4.shop;

import task4.shop_out.Cashier;
import task4.shop_out.SalesDepartment;

public class WorkShop {
    public static void main(String[] args) {
        Logist fedor =  new Logist("Фёдор","Михайлович",122);


        fedor.setResponsibility("Поиск продуктов по дешевле. ");


        LogisticsDepartment ld1 = new LogisticsDepartment();
        ld1.setLogist(new Logist[]{fedor});

        Departments dt = new Departments();
        dt.setLD(new LogisticsDepartment[]{ld1});


        System.out.println(dt);
    }
}
