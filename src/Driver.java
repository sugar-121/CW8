import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private boolean driving;
    List<Trip> requestedTrips = new ArrayList<>();
    List<Trip> acceptedTrips = new ArrayList<>();


    public void chooseTrip(int index){
        if (!driving){
            acceptedTrips.add(requestedTrips.get(index));
        }else {
            System.out.println("you cant choose another trip while you are driving!!");
        }
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driving=" + driving +
                ", requestedTrips=" + requestedTrips +
                ", acceptedTrips=" + acceptedTrips +
                '}';
    }
}
