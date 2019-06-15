package food2door;

public class Order {
    private String name;
    private String product;
    private int count;

    public Order(String name, String product, int count) {
        this.name = name;
        this.product = product;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
