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
import befaster.solutions.CHK.model.products.S;
import befaster.solutions.CHK.model.products.T;
import befaster.solutions.CHK.model.products.U;
import befaster.solutions.CHK.model.products.V;
import befaster.solutions.CHK.model.products.X;
import befaster.solutions.CHK.model.products.Y;
import befaster.solutions.CHK.model.products.Z;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiscountService {

    private final Discount discount = new Discount();

    private final ArrayList<Product> bundleProducts = new ArrayList<>();

    public DiscountService() {
        bundleProducts.add(new S());
        bundleProducts.add(new T());
        bundleProducts.add(new X());
        bundleProducts.add(new Y());
        bundleProducts.add(new Z());
    }

    public int applyDiscount(List<Product> products) {
        int result = 0;

        result += this.discount.buyAnyOfXForY(bundleProducts, products, 3, 45);

        result += this.discount.getXAndGetYForFree(new E(), products, 2, new B());
        result += this.discount.getXAndGetYForFree(new F(), products, 2, new F());
        result += this.discount.getXAndGetYForFree(new N(), products, 3, new M());
        result += this.discount.getXAndGetYForFree(new R(), products, 3, new Q());
        result += this.discount.getXAndGetYForFree(new U(), products, 3, new U());

        result += this.discount.getXPayYDiscount(new A(), products, 5, 50, 3, 20);
        result += this.discount.getXPayYDiscount(new V(), products, 3, 20, 2, 10);
        result += this.discount.getXPayYDiscount(new H(), products, 10, 20, 5, 5);

        result += this.discount.getXPayYDiscount(new B(), products, 2, 15);
        result += this.discount.getXPayYDiscount(new K(), products, 2, 20);
        result += this.discount.getXPayYDiscount(new P(), products, 5, 50);
        result += this.discount.getXPayYDiscount(new Q(), products, 3, 10);

        return result;
    }

}

