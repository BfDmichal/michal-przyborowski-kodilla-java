package food2door;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distributor {
    private List<Company> listOfCompanies;

    public Distributor(List<Company> listOfCompanies) {
        this.listOfCompanies = listOfCompanies;
    }

    public void addCompany(Company company) {
        listOfCompanies.add(company);
    }

    public void removeCompany(Company company) {
        listOfCompanies.remove(company);
    }

    public void orderMaker(Order order) {
        List<Company> temporaryList = listOfCompanies.stream()
                .filter(n -> order.getProduct().equals(n.getProduct()) && order.getCount() <= n.getCount())
                .collect(Collectors.toList());
        if (temporaryList.size()>0) {
            temporaryList.get(0).process();
            System.out.println("Order accepted");
        } else {
            System.out.println("Order rejected");
        }
    }
}
