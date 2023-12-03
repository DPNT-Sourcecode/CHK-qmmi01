package befaster.solutions.CHK.model.products;

import java.util.List;

public abstract class Product {
    protected Integer price;
    protected Character code;

    public Product(Character code, Integer price) {
        this.price = price;
        this.code = code;
    }

    public Character getCode() {
        return code;
    }

}
