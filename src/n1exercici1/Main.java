package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Product alcachofa = new Product("Alcachofa", 0.5f);
        Sale venta1 = new Sale ();
        venta1.addProducts(alcachofa);


        try {
            venta1.getProductList().get(venta1.getProductList().size());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Producto fuera de los límites de la lista");
        }
//        Sale venta1 = new Sale ();
//        venta1.calculateTotal();

    }
}