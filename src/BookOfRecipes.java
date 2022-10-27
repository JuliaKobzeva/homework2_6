import java.util.HashSet;
import java.util.Set;

public class BookOfRecipes {
    private Set<Recipe> bookOfRecipes = new HashSet<>();

    public BookOfRecipes(Set<Recipe> bookOfRecipes) {
        this.bookOfRecipes = bookOfRecipes;
    }

    public void add(Recipe recipe) {
        if (bookOfRecipes.contains(recipe)) {
            throw new RuntimeException("Рецепт " + recipe.getName() + " уже есть в книге");
        } else {
            bookOfRecipes.add(recipe);
        }
    }

    @Override
    public String toString() {
        return "" + bookOfRecipes;
    }
}
