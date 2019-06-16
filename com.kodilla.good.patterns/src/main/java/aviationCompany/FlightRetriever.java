package aviationCompany;

import java.util.*;
import static aviationCompany.Airports.*;

public class FlightRetriever {
    public AviationCompanyDto retrieve(){
        List<Flight> temporaryList = new ArrayList<>();
        temporaryList.add(new Flight(GDANSK,CRACOW,null));
        temporaryList.add(new Flight(GDANSK,CRACOW,WARSAW));
        temporaryList.add(new Flight(WARSAW,MOSCOW,null));
        temporaryList.add(new Flight(DUBLIN,BERLIN,null));
        Flight flight = new Flight(SAN_FRANCISCO,CRACOW,null);
        return new AviationCompanyDto(flight,temporaryList);
    }
}
