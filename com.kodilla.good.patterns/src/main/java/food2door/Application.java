package food2door;

public class Application {
    public static void main(String[] args) {
        Food2DoorRetriever retriever = new Food2DoorRetriever();
        FoodOrderDto retrieve = retriever.retrieve();
        Distributor distributor = new Distributor(retrieve.getList());
        distributor.orderMaker(retrieve.getOrder());
    }
}
