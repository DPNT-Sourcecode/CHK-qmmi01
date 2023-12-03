package befaster.solutions.CHK.service;

import befaster.solutions.CHK.model.products.B;
import befaster.solutions.CHK.model.products.F;
import befaster.solutions.CHK.model.products.L;
import befaster.solutions.CHK.model.products.N;
import befaster.solutions.CHK.model.products.Product;
import befaster.solutions.CHK.model.products.Q;
import befaster.solutions.CHK.model.products.U;

import java.util.LinkedList;
import java.util.List;

public class DiscountService {

    private final List<Product> products;

    public DiscountService(List<Product> products) {
        this.products = products;
    }

    public int applyDiscount() {
        int discount = 0;
        discount += getADiscount();
        discount += getEDiscount();
        discount += getBDiscount();
        discount += getFDiscount();
        discount += getRDiscount();
        discount += getKDiscount();
        discount += getHDiscount();
        discount += getUDiscount();
        discount += getVDiscount();
        discount += getNDiscount();
        discount += getPDiscount();
        discount += getQDiscount();
        return discount;
    }


    private int getADiscount() {
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

        long div = numberOfAs % 5;

        if (div >= 3) {
            return (int) numberOfAs / 5 * 50 + 20;
        }

        return (int) numberOfAs / 5 * 50;
    }

    private int getBDiscount() {
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

    private int getEDiscount() {
        long numberOfEs = products
                .stream()
                .filter(p -> p.getCode() == 'E')
                .count();

        if (numberOfEs < 2) {
            return 0;
        }

        int discount = 0;
        B b = new B();
        while (numberOfEs >= 2 && products.contains(b)) {
            products.remove(b);
            numberOfEs -= 2;
            discount += 30;
        }

        return discount;
    }

    private int getFDiscount() {
        long numberOfFs = products
                .stream()
                .filter(p -> p.getCode() == 'F')
                .count();

        if (numberOfFs < 3) {
            return 0;
        }

        int discount = 0;
        F f = new F();
        while (numberOfFs >= 3 && products.contains(f)) {
            products.remove(f);
            products.remove(f);
            products.remove(f);
            numberOfFs -= 3;
            discount += 10;
        }

        return discount;
    }

    private int getRDiscount() {
        // 3R -> 150 = -30
        long numberOfRs = products
                .stream()
                .filter(p -> p.getCode() == 'R')
                .count();

        if (numberOfRs < 3) {
            return 0;
        }

        int discount = 0;
        Q q = new Q();
        while (numberOfRs >= 3 && products.contains(q)) {
            products.remove(new B());
            numberOfRs -= 3;
            discount += 30;
        }

        return discount;
    }

    private int getKDiscount() {
        // 2K -> 150 = -10
        long numberOfKs = products
                .stream()
                .filter(p -> p.getCode() == 'K')
                .count();

        if (numberOfKs < 2) {
            return 0;
        }

        return (int) numberOfKs / 2 * 10;
    }

    private int getHDiscount() {
        // 5H -> 45 = -5
        // 10H -> 80 = -20
        long numberOfHs = products
                .stream()
                .filter(p -> p.getCode() == 'H')
                .count();

        if (numberOfHs < 5) {
            return 0;
        }

        if (numberOfHs < 10) {
            return 5;
        }

        long div = numberOfHs % 10;

        if (div >= 5) {
            return (int) numberOfHs / 10 * 20 + 5;
        }

        return (int) numberOfHs / 10 * 20;
    }

    private int getUDiscount() {
        long numberOfUs = products
                .stream()
                .filter(p -> p.getCode() == 'U')
                .count();

        if (numberOfUs < 4) {
            return 0;
        }

        int discount = 0;
        U u = new U();
        while (numberOfUs >= 4 && products.contains(u)) {
            products.remove(u);
            products.remove(u);
            products.remove(u);
            numberOfUs -= 4;
            discount += 15;
        }

        return discount;
    }

    private int getVDiscount() {
        // 2V -> 90 = -10
        // 3V -> 130 = -20
        long numberOfVs = products
                .stream()
                .filter(p -> p.getCode() == 'V')
                .count();

        if (numberOfVs < 2) {
            return 0;
        }

        if (numberOfVs < 3) {
            return 10;
        }

        long div = numberOfVs % 3;

        if (div >= 2) {
            return (int) numberOfVs / 3 * 20 + 10;
        }

        return (int) numberOfVs / 3 * 20;
    }

    private int getNDiscount() {
        long numberOfNs = products
                .stream()
                .filter(p -> p.getCode() == 'N')
                .count();

        if (numberOfNs < 3) {
            return 0;
        }

        int discount = 0;
        N n = new N();
        while (numberOfNs >= 4 && products.contains(n)) {
            products.remove(n);
            products.remove(n);
            products.remove(n);
            products.remove(n);
            numberOfNs -= 3;
            discount += 15;
        }

        return discount;
    }

    private int getPDiscount() {
        // 5P -> 200 = -50
        long numberOfPs = products
                .stream()
                .filter(p -> p.getCode() == 'P')
                .count();

        if (numberOfPs < 5) {
            return 0;
        }

        return (int) numberOfPs / 5 * 50;
    }

    private int getQDiscount() {
        // 3Q -> 80 = -10
        long numberOfQs = products
                .stream()
                .filter(p -> p.getCode() == 'Q')
                .count();

        if (numberOfQs < 3) {
            return 0;
        }

        return (int) numberOfQs / 3 * 10;
    }

}
