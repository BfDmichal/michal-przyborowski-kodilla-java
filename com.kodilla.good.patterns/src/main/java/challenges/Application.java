package challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        ProductOrderService productOrderService = new ProductOrderService(new MailSender(),new Order(),new Data());
        productOrderService.process(orderRequestRetriever.retrieve());
    }
}
