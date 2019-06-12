package task25.n2;

public class Use25_2 {
    public static void main(String[] args) {
        BasketImplementationMap bi = new BasketImplementationMap();

        bi.addProduct("Лобстер", 507777);
        bi.addProduct("Кракен", 55);
        bi.addProduct("Лобстер", 77);
        System.out.println(bi.getProducts());

        bi.removeProduct("Лобстер");

        System.out.println(bi.getProducts());
        int i1 = bi.getProductQuantity("Кракен");
        System.out.println(i1);

        bi.addProduct("Вритра", 11);
        bi.addProduct("Грендель", 22);
        bi.addProduct("Каппа", 44);

        System.out.println(bi.getProducts());

        System.out.println(bi.getProductQuantity("Вритра"));
        bi.updateProductQuantity("Вритра", 88);
        System.out.println(bi.getProductQuantity("Вритра"));

        bi.clear();
        System.out.println(bi.getProducts());
    }
}
