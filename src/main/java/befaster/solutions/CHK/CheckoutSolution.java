package befaster.solutions.CHK;

import befaster.solutions.CHK.model.products.Product;
import befaster.solutions.CHK.service.DiscountService;
import befaster.solutions.CHK.service.ProductService;

import java.util.LinkedList;

public class CheckoutSolution {

    private ProductService productService = new ProductService();

    private DiscountService discountService = new DiscountService();


    public Integer checkout(String skus) {
        // Returns -1 if:
        // String is null
        // String is blank or empty
        // String has digits
        if (skus == null || skus.matches(".*\\d.*")) {
            return -1;
        }

        if (skus.isBlank()) {
            return 0;
        }

        int result = 0;

        LinkedList<Product> basket = new LinkedList<>();
        for (char c : skus.toCharArray()) {
            Product product = productService.getByCode(c);
            if (product == null) {
                return -1;
            }
            basket.add(product);
            result += product.getPrice();
        }

        return result - discountService.applyDiscount(basket);

    }
}


