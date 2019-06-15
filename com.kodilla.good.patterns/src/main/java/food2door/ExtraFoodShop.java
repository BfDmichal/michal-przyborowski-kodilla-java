package food2door;

public class ExtraFoodShop implements Company {
    private String product= "Burger";
    private int count = 9;

    @Override
    public String getProduct() {
        return product;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void process() {
        System.out.println("making extra food");
    }
}
