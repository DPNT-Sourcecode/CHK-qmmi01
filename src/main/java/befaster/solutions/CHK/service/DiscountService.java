package befaster.solutions.CHK.service;

import befaster.solutions.CHK.model.products.Product;

import java.util.LinkedList;
import java.util.List;

public class DiscountService {

    public int applyDiscount(List<Product> products) {
        LinkedList<Product> aux = new LinkedList<>(products);
        int discount = 0;
        discount += getADiscount(aux);
        discount += getEDiscount(aux);
        discount += getBDiscount(aux);
        return discount;
    }


    private int getADiscount(List<Product> products) {

        // 3A -> 130 = -20
        // 5A -> 200 = -50
        long numberOfAs = products
                .stream()
                .filter(p -> p.getCode() == 'A')
                .count();

        if (numberOfAs < 3) {
            return 0;
        }

        if (numberOfAs == 4) {
            return 20;
        }

        long div = numberOfAs % 5;
        if (div == 0) {
            return (int) numberOfAs / 5 * 50;
        }

        if (div > 3) {
            return (int) numberOfAs / 5 * 50 + 20;
        }

        return 0;
    }

    private int getBDiscount(List<Product> products) {
        // 2B -> 45 = -15
        long numberOfBs = products
                .stream()
                .filter(p -> p.getCode() == 'B')
                .count();

        if (numberOfBs < 2) {
            return 0;
        }

        return (int) numberOfBs / 2 * 15;
    }

    private int getEDiscount(List<Product> products) {
        // 2B -> 45 = -15
        long numberOfEs = products
                .stream()
                .filter(p -> p.getCode() == 'E')
                .count();

        if (numberOfEs < 2) {
            return 0;
        }

        int discount = 0;
        while (products.contains('B')) {
            products.remove('B');
            discount += 30;
        }

        return discount;
    }

}

