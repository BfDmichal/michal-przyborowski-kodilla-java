package challenges;

public class Data implements OrderRepository{

    @Override
    public void createOrder(User user, Product product, int count) {
        System.out.println("saved");
    }
}
