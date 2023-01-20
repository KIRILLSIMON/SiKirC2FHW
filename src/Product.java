import java.util.Objects;

public class Product {

    private String name;
    private int amount;
    private int price;

    public Product(String name, int amount, int price) {
        setName(name);
        setAmount(amount);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Название должно быть заполненно!");
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Количество должно быть положительным!");

        }
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть положительной!");

        }
        this.price = price;
    }


        @Override
        public boolean equals (Object o){
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Product product = (Product) o;
            return Objects.equals(name, product.name);
        }

        @Override
        public int hashCode () {
            return Objects.hash(name);
    }
}
