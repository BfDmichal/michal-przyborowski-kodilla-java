package challenges;

public interface OrderRepository {
    public void createOrder(User user, Product product, int count);
}
