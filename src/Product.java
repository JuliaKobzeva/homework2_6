import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    private double kg;

    public Product(String name, double cost, double kg) {

        if(name == null || name.isBlank() || name.isEmpty()){
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }

        setCost(cost);
        setKg(kg);
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if(cost == 0){
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.cost = cost;
        }
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        if(kg == 0){
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.kg = kg;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 && Double.compare(product.kg, kg) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, kg);
    }

    @Override
    public String toString() {
        return name;
    }
}
