package befaster.solutions.CHK.model.products;

public abstract class Product {
    protected Integer price;
    protected Character code;

    public Product(Character code,Integer price){
        this.price = price;
        this.code = code;
    }

}

