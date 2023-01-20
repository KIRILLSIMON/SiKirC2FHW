import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {

    private String name;
    private final Map<Product, Integer> products;

    private int price;

    public Recipe(String name) {
        this.name = name;
        this.products =new HashMap<>();
        this.price = 0;
    }
    public void add(Product product){
        add(product,1);
        for(int i=0;i<products.size();i++){
            if (i<products.size()-1){
                for (int j=i+1;j<products.size();j++){
                    if (products.get(i).equals(products.get(j))){
                        throw new EmptyBlank("Есть схожие продукты "+"["+products.get(i)+"]");
                    }
                }
            }
        }
    }

    public void add(Product product, int amount){
        if (products.containsKey(product)){
            throw new IllegalArgumentException("Такой продукт уже есть в списке");
        }
        products.put(product,amount);
        price += amount * product.getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
