package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;
import befaster.solutions.CHK.products.A;
import befaster.solutions.CHK.products.B;
import befaster.solutions.CHK.products.C;
import befaster.solutions.CHK.products.D;
import befaster.solutions.CHK.products.E;
import befaster.solutions.CHK.products.Product;

import java.util.HashMap;

public class CheckoutSolution {

    // Map of String (SKU) -> Value (Pound)
    private HashMap<Character, Product> products = new HashMap<>();
    private HashMap<Character, String> specialOffers = new HashMap<>();

    public CheckoutSolution() {
        init();
    }

    private void init() {
        products.put('A', new A());
        products.put('B', new B());
        products.put('C', new C());
        products.put('D', new D());
        products.put('E', new E());

        specialOffers.put('A', "3,20");
        specialOffers.put('B', "2,15");
        specialOffers.put('E', "2,30");
    }

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

        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : skus.toCharArray()) {
            Integer freq = frequencies.get(c);
            frequencies.put(c, freq == null ? 1 : freq + 1);
        }

        int result = 0;

        for (Character c : frequencies.keySet()) {

            Integer productValue = products.get(c);
            if (productValue == null) {
                return -1;
            }

            Integer currentNumberOfProducts = frequencies.get(c);
            result = result + currentNumberOfProducts * productValue;

            String specialOfferForCurrentProduct = specialOffers.get(c);
            if (specialOfferForCurrentProduct != null) {
                String[] split = specialOfferForCurrentProduct.split(",");
                int specialOfferProductCounter = Integer.parseInt(split[0]);
                int specialOfferValue = Integer.parseInt(split[1]);

                result = result - (currentNumberOfProducts / specialOfferProductCounter) * specialOfferValue;
            }

        }

        return result;

    }
}

