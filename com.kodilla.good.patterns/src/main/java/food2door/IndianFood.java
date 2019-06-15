package food2door;


public class IndianFood implements Company {
    private String product;
    private int count;

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
        System.out.println("making indian food");
    }
}
