import java.util.HashSet;
import java.util.Set;

public class RecipeList {

private final Set<Recipe> recipes=new HashSet<>();
    public void add(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть в списке");
        }
        recipes.add(recipe);
    }
}
