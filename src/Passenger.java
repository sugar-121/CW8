import java.util.ArrayList;
import java.util.List;

public class Passenger {

    private String name;
    private List<Trip> trips = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Trip> getTrips() {
        return trips;
    }


    public void request(Trip trip){
        this.trips.add(trip);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", trips=" + trips +
                '}';
    }
}
