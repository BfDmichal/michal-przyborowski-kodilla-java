package challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Anna", "Hanna");
        Product product = new Book("Snake Among Mammal", 1000000);

        return new OrderRequest(user, product, 2);
    }
}
