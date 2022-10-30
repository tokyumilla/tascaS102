package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList <Product> productList;
    private float totalCost;

    public Sale() {
        this.productList = new ArrayList<>();
    }

    public void calculateTotal() {
        try {
            validateSale (productList);
            totalCost = 0;
            for (int i = 0; i < productList.size() ; i++) {
                totalCost += productList.get(i).getPrice();
            }
        } catch (EmptySaleException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void validateSale (ArrayList <Product> productList) throws EmptySaleException {
        if (productList.size() == 0)
            throw new EmptySaleException("Para hacer una venta primero tienes que añadir productos");
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    public void addProducts (Product product) {
        this.productList.add(product);
    }
}
