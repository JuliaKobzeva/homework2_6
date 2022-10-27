import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product банан = new Product("банан", 70.0, 1.0);
        Product апельсин = new Product("апельсин", 80.0, 1.0);
        Product персик = new Product("персик", 110.0, 1.0);
        Product виноград = new Product("виноград", 150.0, 1.0);
        Product киви = new Product("киви", 90.0, 1.0);
        Product яйца = new Product("яйца", 100.0, 1.0);
        Product мука = new Product("мука", 80.0, 1.0);
        Product масло = new Product("масло", 120.0, 1.0);
        Product молоко = new Product("молоко", 100.0, 1.0);
        Product йогурт = new Product("йогурт", 90.0, 1.0);

        Set<Product> listOfProducts2 = new HashSet<>();
        ListOfProducts listOfProducts = new ListOfProducts(listOfProducts2);
        listOfProducts.add(банан);
        listOfProducts.add(апельсин);
        listOfProducts.add(персик);
        listOfProducts.add(виноград);
        listOfProducts.add(киви);
        System.out.println(listOfProducts);

        listOfProducts.remove(персик);
        listOfProducts.isBought();

//        listOfProducts.add(киви);

        HashMap<Product, Integer> blinyProducts = new HashMap<>();
        blinyProducts.put(яйца,2);
        blinyProducts.put(мука,1);
        blinyProducts.put(молоко,1);

        Recipe bliny = new Recipe(blinyProducts,"блины");
        System.out.println(bliny);

        HashMap<Product, Integer> keksProducts = new HashMap<>();
        keksProducts.put(яйца,1);
        keksProducts.put(мука,1);
        keksProducts.put(масло,1);
        keksProducts.put(йогурт,1);

        Recipe keks = new Recipe(keksProducts,"кекс");
        System.out.println(keks);

        Set<Recipe> bookOfRecipes2 = new HashSet<>();
        BookOfRecipes bookOfRecipes = new BookOfRecipes(bookOfRecipes2);

        bookOfRecipes.add(bliny);
        bookOfRecipes.add(keks);
//        bookOfRecipes.add(keks);

        System.out.println(bookOfRecipes);
    }
}
