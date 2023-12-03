package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;

public class CheckoutSolution {

    // Map of String (SKU) -> Value (Pound)
    private HashMap<Character, Integer> products = new HashMap<>();
    private HashMap<Character, String> specialOffers = new HashMap<>();

    public CheckoutSolution() {
        init();
    }

    private void init() {
        products.put('A', 50);
        products.put('B', 30);
        products.put('C', 20);
        products.put('D', 15);

        specialOffers.put('A', "3,130");
        specialOffers.put('B', "2,45");
    }

    public Integer checkout(String skus) {
        // Returns -1 if:
        // String is null
        // String is blank or empty
        // String has digits
        if (skus == null || skus.isBlank() || skus.matches(".*\\d.*")) {
            return -1;
        }

        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : skus.toCharArray()) {
            Integer freq = frequencies.get(c);
            frequencies.put(c, freq == null ? 1 : freq + 1);
        }

        for (Character c : frequencies.keySet()) {
            Integer currentNumberOfProducts = frequencies.get(c);
            String specialOfferForCurrentProduct = specialOffers.get(c);
            if (specialOfferForCurrentProduct != null) {
                String[] split = specialOfferForCurrentProduct.split(",");
                Integer specialOfferProductCounter = Integer.parseInt(split[0]);
                Integer specialOfferValue = Integer.parseInt(split[1]);

                int aux =  currentNumberOfProducts / specialOfferProductCounter;
            }

        }

        return 0;

    }
}

