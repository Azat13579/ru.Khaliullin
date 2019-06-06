package task23;

import java.util.ArrayList;
import java.util.List;

public class Use23 {
    public static void main(String[] args) {
        BasketImplementation bi = new BasketImplementation();

        bi.addProduct("Лобстеры", 507777);
        bi.addProduct("Лобстерик", 50);
        System.out.println(bi.getProducts());

        bi.removeProduct("Лобстеры");

        System.out.println(bi.getProducts());
        int i1 = bi.getProductQuantity("Лобстерик");
        System.out.println(i1);

        bi.addProduct("Сатана", 507);
        bi.addProduct("Ад", 777);
        bi.addProduct("Маленький котенок Сатаны", 77);

        bi.updateProductQuantity("Сатана", 507);

        System.out.println(bi.getProducts());
        bi.clear();
    }


}
