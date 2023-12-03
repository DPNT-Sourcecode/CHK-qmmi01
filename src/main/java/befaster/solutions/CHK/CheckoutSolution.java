package befaster.solutions.CHK;

import befaster.solutions.CHK.model.products.Product;

import java.util.LinkedList;

public class CheckoutSolution {


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
            initialBasket.add(new )
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


