package challenges;

public class OrderRequest {
    private User user;
    private Product product;
    private int count;

    public OrderRequest(User user, Product product, int count) {
        this.user = user;
        this.product = product;
        this.count = count;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getCount() {
        return count;
    }
}
