import java.util.HashSet;
import java.util.Set;

public class ListOfProducts {
    private Set<Product> listOfProducts = new HashSet<>();

    public ListOfProducts(Set<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public void add(Product product) {
        if (listOfProducts.contains(product)) {
            throw new RuntimeException("Продукт " + product.getName() + " уже в корзине");
        } else {
            listOfProducts.add(product);
        }
    }

    public void remove(Product product) {
            listOfProducts.remove(product);
    }

    public void isBought(){
            System.out.println(listOfProducts + " - товар уже куплен");
    }


    public Set<Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public String toString() {
        return "" + listOfProducts;
    }
}
