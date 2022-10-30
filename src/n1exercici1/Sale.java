package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList <Product> productList;
    private float totalCost;

    public void calculateTotal() {
        try {
            excepcion (productList);
            float total = 0;
            for (int i = 0; i < productList.size() ; i++) {
                total += productList.get(i).getPrice();

            }
        } catch (EmptySaleException ex) {
            System.out.println(ex.getMessage());

        } finally {

        }
    }

    public void excepcion (ArrayList <Product> productList) throws EmptySaleException {
        if (productList.size() == 0)
            throw new EmptySaleException("Para hacer una venta primero tienes que añadir productos");
    }
}
