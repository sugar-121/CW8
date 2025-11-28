package entity;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private Integer id;
    private String name;
    private Trip currentTripRequest;
    private List<Trip> trips = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }

    public Passenger(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Trip> getTrips() {
        return trips;
    }


    public void request(Trip trip) {
        this.currentTripRequest = trip;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id= " + id +
                "name='" + name + '\'' +
                ", trips=" + trips +
                '}';
    }
}
