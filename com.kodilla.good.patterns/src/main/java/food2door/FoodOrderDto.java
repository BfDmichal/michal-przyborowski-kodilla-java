package food2door;

import java.util.List;

public class FoodOrderDto {
    private Order order;
    private List<Company> list;

    public FoodOrderDto(Order order, List<Company> list) {
        this.order = order;
        this.list = list;
    }

    public Order getOrder() {
        return order;
    }

    public List<Company> getList() {
        return list;
    }
}
