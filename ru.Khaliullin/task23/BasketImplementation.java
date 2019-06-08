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

        this.bIInteger.remove(iuRQ);
        this.bIInteger.add(iuRQ, quantity);
    }

    @Override
    public void clear() {
        bIString.clear();
        bIInteger.clear();
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
