package hw32;

public class Store {
    public ForSale[] forSales;

    public Store(int size) {
        if (size > 0) {
            forSales = new ForSale[size];
        }
    }
}
