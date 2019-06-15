package food2door;

public class ChinaFood implements Company {
    private String product = "Chicken";
    private int count = 12;

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
        System.out.println("Making china food");
    }
}
