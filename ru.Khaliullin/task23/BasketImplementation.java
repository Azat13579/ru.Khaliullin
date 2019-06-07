package task23;

import java.util.*;

public class BasketImplementation implements Basket {


    private List<String> bIString = new ArrayList<>(25);
    private List<Integer> bIInteger = new ArrayList<>(25);

    private static int i = 0;

    @Override
    public void addProduct(String product, int quantity) {
        bIString.add(i, product);
        bIInteger.add(i, quantity);
        i++;
    }

    @Override
    public void removeProduct(String product) {
        int iRP = bIString.indexOf(product);
        bIString.remove(iRP);
        bIInteger.remove(iRP);
        i--;
    }


    @Override
    public void updateProductQuantity(String product, int quantity) {
        int iuRQ = bIString.indexOf(product);
        int iuRQ2 = bIInteger.indexOf(quantity);

        if (iuRQ == iuRQ2) {
            System.out.println("Элементы на одном уровне:");
        } else {
            System.out.println("Элементы на разных уровнях:");
        }

        System.out.println("iuRQ = " + iuRQ);
        System.out.println("iuRQ2 = " + iuRQ2);
        System.out.println("- - - - - - - - - - - - - - - - - ");
        System.out.println("Выберете что вы хотите заменить, название продукта №1 или его колличество №2: ");
        Scanner scan = new Scanner(System.in);
        int selectionOfChangeable = scan.nextInt();
        String ss1;
        Integer q;
        if (selectionOfChangeable == 1) {
            System.out.println("Введите новое название продукта, в замен " + product);
            Scanner scan1 = new Scanner(System.in);
            ss1 = scan1.nextLine();  // TODO не могу понять почему не работает, когда пишем просто \scan\
            this.bIString.remove(iuRQ);
            this.bIString.add(iuRQ, ss1);
        } else if (selectionOfChangeable == 2) {
            System.out.println("Введите новое колличество продукта, в замен " + quantity);
            Scanner scan1 = new Scanner(System.in);
            q = scan1.nextInt();
            this.bIInteger.remove(iuRQ2);
            this.bIInteger.add(iuRQ2, q);
        }

    }

    @Override
    public void clear() {

        /*Iterator<String> it = bIString.iterator();
        Iterator<Integer> it1 = bIInteger.iterator();
        while (it.hasNext()) {
            it.remove();
            //it1.remove();

        }*/
       // boolean hg = bIString.removeAll(String);
        for (int i3 = i-1; i3 > -1; i3--) {
            bIString.remove(i3);
            bIInteger.remove(i3);
        }


    }

    @Override
    public List<String> getProducts() {
        return bIString;
    }

    @Override
    public int getProductQuantity(String product) {
        int gGRQ = bIString.indexOf(product);
        return bIInteger.get(gGRQ);
    }
}
