package befaster.solutions.CHK.model.products;


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

    public int getPrice(){
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        Product aux = (Product) obj;
        if (aux == null) {
            return false;
        }
        return this.code == aux.getCode();
    }

}

