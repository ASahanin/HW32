package hw32;

public class Main {
    public static void main(String[] args) {
        Store store = new Store(10);
        for (int i = 0; i < 10; i++) {
            if (i < 3) {
                store.forSales[i] = new Clothes();
            }
            else if (i < 7) {
                store.forSales[i] = new Water();
            }
            else {
                store.forSales[i] = new Food();
            }
        }

        for (ForSale forSale : store.forSales) {
            forSale.sale();
        }

        for (ForSale forSale : store.forSales) {
            if (forSale instanceof Water) {
                ((Water)forSale).drink();
            }
            else if (forSale instanceof Food) {
                ((Food)forSale).eat();
            }
            else if (forSale instanceof Clothes) {
                ((Clothes)forSale).wear();
            }
        }
    }
}
