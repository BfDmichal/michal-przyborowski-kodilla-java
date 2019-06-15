package challenges;

public class OrderDto {
    private User user;
    private Product product;
    private boolean enable;

    public OrderDto(Product product, boolean enable) {
        this.product = product;
        this.enable = enable;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isEnable() {
        return enable;
    }
}
