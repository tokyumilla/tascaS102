package n1exercici1;

import java.util.ArrayList;

public class Sale {
    private ArrayList <Product> productList;
    private float totalCost;

    public void calculateTotal() throws EmptySaleException {
        try {
            float total = 0;
            for (int i = 0; i < productList.size() ; i++) {
                total += productList.get(i).getPrice();

            }
        } catch (EmptySaleException) {

//("Para hacer una venta primero tienes que añadir productos")
        }

    }
}
