package befaster.solutions.CHK;

import befaster.solutions.CHK.model.products.Product;
import befaster.solutions.CHK.service.ProductService;

import java.util.LinkedList;

public class CheckoutSolution {

    private ProductService productService = new ProductService();


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

        LinkedList<Product> initialBasket = new LinkedList<>();
        for (char c : skus.toCharArray()) {
            initialBasket.add(productService.getByCode(c));
        }

        int result = 0;



        return result;

    }
}
