package task25.n2;

import java.util.Map;
import java.util.TreeMap;

public class BasketImplementationMap implements BasketMap {
    private Map<String, Integer> bIStringAndInteger = new TreeMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        bIStringAndInteger.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        bIStringAndInteger.remove(product);
    }


    @Override
    public void updateProductQuantity(String product, int quantity) {
        bIStringAndInteger.put(product, quantity);
    }

    @Override
    public void clear() {
        bIStringAndInteger.clear();
    }

    @Override
    public Map<String, Integer> getProducts() {
        return bIStringAndInteger;
    }

    @Override
    public int getProductQuantity(String product) {
        return  bIStringAndInteger.get(product);
    }
}
