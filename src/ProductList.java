import java.util.HashMap;
import java.util.Map;

public class ProductList {
private final Map<Product, Integer> products=new HashMap();
public void add(Product product, int ammount){
    if (products.containsKey(product)){
    throw new IllegalArgumentException("Такой продукт уже есть в списке");
        }
    products.put(product,ammount);
    }
    public void add(Product product) {
       add(product,1);
    }
}
