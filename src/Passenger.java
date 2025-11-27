import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private String name;
    private List<Trip> trip = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trip> getTrip() {
        return trip;
    }

    public void setTrip(List<Trip> trip) {
        this.trip = trip;
    }

    public void request(Trip trip){
        this.trip.add(trip);
    }
}
