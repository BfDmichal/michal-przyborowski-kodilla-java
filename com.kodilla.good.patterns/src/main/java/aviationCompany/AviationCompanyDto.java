package aviationCompany;

import java.util.List;

public class AviationCompanyDto {
    private Flight flight;
    private List<Flight> list;

    public AviationCompanyDto(Flight flight, List<Flight> list) {
        this.flight = flight;
        this.list = list;
    }

    public Flight getFlight() {
        return flight;
    }

    public List<Flight> getList() {
        return list;
    }
}
