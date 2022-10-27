import java.util.*;

public class Recipe {
    private HashMap<Product, Integer> products;
    private double productsCost;
    private String name;

    public Recipe(HashMap<Product, Integer> products, String name) {
        this.products = products;
        this.name = name;

        //Не получается почитать стоимость продуктов в рецепте с учетом количества

//        List<Product>list = List.of(products.keySet().toArray(new Product[0]));
//
//        for (Product product: list) {
//                this.productsCost += product.getCost();
//            }

        for (Map.Entry entry: products.entrySet()) {
            Product product = (Product) entry.getKey();
            int cost = (int) entry.getValue();
            this.productsCost += product.getCost() * cost;
        }
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public Double getproductsCost() {
        return productsCost;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, productsCost, name);
    }

    @Override
    public String toString() {
        return "Рецепт: " + name +
                " Продукты: " + products +
                " Стоимость: " + productsCost;
    }
}
