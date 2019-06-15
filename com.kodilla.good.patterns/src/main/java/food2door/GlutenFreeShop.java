package food2door;


public class GlutenFreeShop implements Company {
    private String product = "Apple";
    private int count = 8;

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
        System.out.println("making free food");
    }
}
