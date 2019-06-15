package challenges;


public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
    boolean isOrder = orderService.order(orderRequest);
        if (isOrder) {
            informationService.send(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getProduct(),orderRequest.getCount());
            return new OrderDto(orderRequest.getProduct(),true);
        } else {
            return new OrderDto(orderRequest.getProduct(),false);
        }
    }
}
