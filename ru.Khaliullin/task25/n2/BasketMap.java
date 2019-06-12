package task25.n2;

import java.util.Map;

public interface BasketMap {
    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    Map<String, Integer> getProducts();

    int getProductQuantity(String product);
}
