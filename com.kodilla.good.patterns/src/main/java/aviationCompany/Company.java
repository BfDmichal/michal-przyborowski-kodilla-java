package aviationCompany;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Company {
    private List<Flight> listOfFlights;

    public Company(List<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public List<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void addFlight(Flight flight) {
        listOfFlights.add(flight);
    }

    public void removeFlight(Flight flight) {
        listOfFlights.remove(flight);
    }

    public Set<Flight> searchFlightFrom(Airports flyFrom) {
        return listOfFlights.stream()
                .filter(n -> n.getFrom().equals(flyFrom) || (n.getThrough() != null && n.getThrough().equals(flyFrom)))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchFlightTo(Airports flyTo) {
        return listOfFlights.stream()
                .filter(n -> n.getTo().equals(flyTo) || (n.getThrough() != null && n.getThrough().equals(flyTo)))
                .collect(Collectors.toSet());
    }

    public Set<Flight> searchFlightToWithChange(Airports flyTo) {
        return listOfFlights.stream()
                .filter(n -> n.getTo().equals(flyTo) && n.getThrough() != null)
                .collect(Collectors.toSet());
    }
}
