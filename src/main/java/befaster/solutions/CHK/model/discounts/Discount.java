package befaster.solutions.CHK.model.discounts;

import befaster.solutions.CHK.model.products.Product;

import java.util.List;
import java.util.stream.Stream;

public class Discount {

    public int getADiscounts(List<Product> products) {

        // 3A -> 130 = -20
        // 5A -> 200 = -50
        long numberOfAs = products
                .stream()
                .filter(p -> p.getCode() == 'A')
                .count();

        if (numberOfAs < 3) {
            return 0;
        }

        if (numberOfAs < 5) {
            return 20;
        }

        if (numberOfAs % 5 == 0) {
            return (int) numberOfAs / 5 * 50;
        }
        return 0;
    }


    public int getBDiscount(List<Product> products) {
        return 0;
    }

    public int getEDiscount(List<Product> products) {
        return 0;
    }
}
