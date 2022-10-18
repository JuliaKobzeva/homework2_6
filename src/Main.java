import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product банан = new Product("банан", 70.0, 1.0);
        Product апельсин = new Product("апельсин", 80.0, 1.0);
        Product персик = new Product("персик", 110.0, 1.0);
        Product виноград = new Product("виноград", 150.0, 1.0);
        Product киви = new Product("киви", 90.0, 1.0);

        Set<Product> listOfProducts = new HashSet<>();
        listOfProducts.add(банан);
        listOfProducts.add(апельсин);
        listOfProducts.add(персик);
        listOfProducts.add(виноград);
        listOfProducts.add(киви);
        listOfProducts.add(киви);

        listOfProducts.remove(персик);

        System.out.println(listOfProducts);

        isBought(listOfProducts);
    }

    public static void isBought(Set<Product> listOfProducts){
        System.out.println(listOfProducts + " - товар уже куплен");
    }
}
