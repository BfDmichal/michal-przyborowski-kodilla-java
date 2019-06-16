package aviationCompany;

public class Application {
    public static void main(String[] args) {
        FlightRetriever retriever = new FlightRetriever();
        Company company = new Company(retriever.retrieve().getList());
        FlightSearcherProcessor flightSearcherProcessor = new FlightSearcherProcessor(company);
        flightSearcherProcessor.searchFlightFrom(retriever.retrieve().getFlight().getFrom());
        flightSearcherProcessor.searchFlightTo(retriever.retrieve().getFlight().getTo());
        flightSearcherProcessor.searchFlightToWithChange(retriever.retrieve().getFlight().getTo());
    }

}
