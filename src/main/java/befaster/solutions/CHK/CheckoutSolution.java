package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;

public class CheckoutSolution {

    // Map of String (SKU) -> Value (Pound)
    private HashMap<String, Integer> products = new HashMap<>();
    private HashMap<String, Integer> specialOffers = new HashMap<>();

    public CheckoutSolution() {
        init();
    }

    private void init() {
        products.put("A", 50);
        products.put("B", 30);
        products.put("C", 20);
        products.put("D", 15);

        specialOffers.put("3A", 130);
        specialOffers.put("2B", 45);
    }

    public Integer checkout(String skus) {
        // Returns -1 if:
        // String is null
        // String is blank or empty
        // String has digits
        if (skus == null || skus.isBlank() || skus.matches(".*\\d.*")) {
            return -1;
        }

        skus.split
    }
}


