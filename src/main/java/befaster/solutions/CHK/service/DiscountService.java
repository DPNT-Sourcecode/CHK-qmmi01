package befaster.solutions.CHK.service;

import befaster.solutions.CHK.model.discounts.Discount;
import befaster.solutions.CHK.model.products.A;
import befaster.solutions.CHK.model.products.B;
import befaster.solutions.CHK.model.products.E;
import befaster.solutions.CHK.model.products.F;
import befaster.solutions.CHK.model.products.H;
import befaster.solutions.CHK.model.products.K;
import befaster.solutions.CHK.model.products.L;
import befaster.solutions.CHK.model.products.M;
import befaster.solutions.CHK.model.products.N;
import befaster.solutions.CHK.model.products.P;
import befaster.solutions.CHK.model.products.Product;
import befaster.solutions.CHK.model.products.Q;
import befaster.solutions.CHK.model.products.R;
import befaster.solutions.CHK.model.products.U;
import befaster.solutions.CHK.model.products.V;

import java.util.List;

public class DiscountService {

    private final Discount discount = new Discount();

    public int applyDiscount(List<Product> products) {
        int discount = 0;

        discount += this.discount.getXAndGetYForFree(new E(), products, 2, new B());
        discount += this.discount.getXAndGetYForFree(new F(), products, 2, new F());
        discount += this.discount.getXAndGetYForFree(new N(), products, 3, new M());
        discount += this.discount.getXAndGetYForFree(new R(), products, 3, new Q());
        discount += this.discount.getXAndGetYForFree(new U(), products, 3, new U());

        discount += this.discount.getXPayYDiscount(new A(), products, 5, 50, 3, 20);
        discount += this.discount.getXPayYDiscount(new V(), products, 3, 20, 2, 10);
        discount += this.discount.getXPayYDiscount(new H(), products, 10, 20, 5, 5);

        discount += this.discount.getXPayYDiscount(new B(), products, 2, 15);
        discount += this.discount.getXPayYDiscount(new K(), products, 2, 10);
        discount += this.discount.getXPayYDiscount(new P(), products, 5, 50);
        discount += this.discount.getXPayYDiscount(new Q(), products, 3, 10);

        return discount;
    }

}
