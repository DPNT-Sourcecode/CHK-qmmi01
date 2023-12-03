package befaster.solutions.CHK.model.discounts;

import befaster.solutions.CHK.model.products.Product;

import java.util.List;
import java.util.Objects;

public class Discount {

    public int getXPayYDiscount(Product product, List<Product> productList, int numberOfProductsForDiscount, int discount) {
        long numberOfProducts = productList
                .stream()
                .filter(p -> Objects.equals(p.getCode(), product.getCode()))
                .count();

        if (numberOfProducts < numberOfProductsForDiscount) {
            return 0;
        }

        return (int) numberOfProducts / numberOfProductsForDiscount * discount;
    }

    public int getXPayYDiscount(Product product, List<Product> productList, int numberOfProductsForHigherDiscount, int higherDiscount, int numberOfProductsLowerDiscount, int lowerDiscount) {
        long numberOfProducts = productList
                .stream()
                .filter(p -> Objects.equals(p.getCode(), product.getCode()))
                .count();

        if (numberOfProducts < numberOfProductsLowerDiscount) {
            return 0;
        }

        if (numberOfProducts < numberOfProductsForHigherDiscount) {
            return lowerDiscount;
        }

        long div = numberOfProducts % numberOfProductsForHigherDiscount;

        if (div >= numberOfProductsLowerDiscount) {
            return (int) numberOfProducts / numberOfProductsForHigherDiscount * higherDiscount + lowerDiscount;
        }

        return (int) numberOfProducts / numberOfProductsForHigherDiscount * higherDiscount;
    }

    public int getXAndGetYForFree(Product product, List<Product> productList, int numberOfProductsForDiscount, Product freeProduct) {
        long numberOfProducts = productList
                .stream()
                .filter(p -> Objects.equals(p.getCode(), product.getCode()))
                .count();

        if (numberOfProducts < numberOfProductsForDiscount) {
            return 0;
        }

        int discount = 0;
        while (numberOfProducts >= numberOfProductsForDiscount && productList.contains(freeProduct)) {
            for (int i = 0; i < numberOfProductsForDiscount + 1; i++) {
                productList.remove(freeProduct);
            }
            numberOfProducts -= numberOfProductsForDiscount;
            discount += freeProduct.getPrice();
        }

        return discount;
    }

}


