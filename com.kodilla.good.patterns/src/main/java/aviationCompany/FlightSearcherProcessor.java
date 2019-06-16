package aviationCompany;

import java.util.Set;

public class FlightSearcherProcessor {
    private Company company;

    public FlightSearcherProcessor(Company company) {
        this.company = company;
    }

    public void searchFlightFrom(Airports flyFrom) {
        Set<Flight> listOfFlightsFrom = company.searchFlightFrom(flyFrom);
        if (listOfFlightsFrom.isEmpty()) {
            System.out.println("Have no flights from: " + flyFrom);
        } else {
            System.out.println(listOfFlightsFrom.toString());
        }
    }

    public void searchFlightTo(Airports flyTo) {
        Set<Flight> listOfFlightsTo = company.searchFlightTo(flyTo);
        if (listOfFlightsTo.isEmpty()) {
            System.out.println("Have no flights to: " + flyTo);
        } else {
            System.out.println(listOfFlightsTo.toString());
        }
    }

    public void searchFlightToWithChange(Airports flyTo) {
        Set<Flight> listOfLongFlights = company.searchFlightToWithChange(flyTo);
        if (listOfLongFlights.isEmpty()) {
            System.out.println("Have no flight to " + flyTo + " with changes.");
        } else {
            System.out.println(listOfLongFlights.toString());
        }
    }
}
