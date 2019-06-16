package aviationCompany;

import java.util.Objects;

public class Flight {
    private Airports from;
    private Airports through;
    private Airports to;

    public Flight(Airports from, Airports to, Airports through) {
        this.from = from;
        this.to = to;
        this.through = through;
    }

    public Airports getFrom() {
        return from;
    }

    public Airports getTo() {
        return to;
    }

    public Airports getThrough() {
        return through;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(getFrom(), flight.getFrom()) &&
                Objects.equals(getThrough(), flight.getThrough()) &&
                Objects.equals(getTo(), flight.getTo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrom(), getThrough(), getTo());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", through='" + through + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
