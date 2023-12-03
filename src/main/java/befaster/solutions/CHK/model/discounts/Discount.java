package befaster.solutions.CHK.model.discounts;

import befaster.solutions.CHK.model.products.L;
import befaster.solutions.CHK.model.products.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
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
            for (int i = 0; i < numberOfProductsForDiscount; i++) {
                productList.remove(product);
            }
            boolean remove = productList.remove(freeProduct);
            if (remove) {
                numberOfProducts = productList
                        .stream()
                        .filter(p -> Objects.equals(p.getCode(), product.getCode()))
                        .count();
                discount += freeProduct.getPrice();
            } else {
                return discount;
            }

        }

        return discount;
    }

    public int buyAnyOfXForY(List<Product> acceptedProducts, List<Product> productList, int numberOfProductsForDiscount, int priceToPay) {
        productList.sort(Comparator.comparingInt(Product::getPrice).reversed());

        LinkedList<Product> matched = new LinkedList<>();
        int result = 0;
        for (Product product : productList) {
            if (matched.size() == numberOfProductsForDiscount) {
                result += matched.stream().mapToInt(Product::getPrice).sum() - priceToPay;
                matched.clear();
            }
            if (acceptedProducts.contains(product)) {
                matched.add(product);
            }
        }

        return result;
    }

}
