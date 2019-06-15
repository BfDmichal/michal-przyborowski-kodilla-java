package food2door;

import java.util.ArrayList;
import java.util.List;

public class Food2DoorRetriever {
    public FoodOrderDto retrieve(){
        List<Company> list = new ArrayList<>();
        list.add(new GlutenFreeShop());
        list.add(new ChinaFood());
        list.add(new ExtraFoodShop());
        list.add(new IndianFood());
        Order order = new Order("Adam","Apple",5);
        return new FoodOrderDto(order,list);
    }
}
