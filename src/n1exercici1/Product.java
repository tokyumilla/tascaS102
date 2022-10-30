package n1exercici1;

public class Product {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
