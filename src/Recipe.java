import java.util.List;
import java.util.Objects;

public class Recipe {
    private List<Product> products;
    private double productsCost;
    private String name;

    public Recipe(List<Product> products, String name) {
        this.products = products;
        this.name = name;

        for (Product product: products) {
            this.productsCost = product.getCost() * products.size();
        }
    }

    public List<Product> getProducts() {
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
