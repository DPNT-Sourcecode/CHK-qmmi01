package befaster.solutions.CHK.service;

import befaster.solutions.CHK.model.products.A;
import befaster.solutions.CHK.model.products.B;
import befaster.solutions.CHK.model.products.C;
import befaster.solutions.CHK.model.products.D;
import befaster.solutions.CHK.model.products.E;
import befaster.solutions.CHK.model.products.Product;

import java.util.HashMap;

public class ProductService {

    private HashMap<Character, Product> products = new HashMap<>();

    public ProductService() {
        init();
    }

    private void init() {
        products.put('A', new A());
        products.put('B', new B());
        products.put('C', new C());
        products.put('D', new D());
        products.put('E', new E());
    }

    public Product getByCode(Character code) {
        return products.get(code);
    }
}

