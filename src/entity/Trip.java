package entity;

public class Trip {
    private Location startingPoint;
    private Location destination;
    private int price;
    private String tripStatus;
    private Integer passengerId;
    private Integer driverId;

    public Trip(Location startingPoint, Location destination) {
        this.destination = destination;
        this.startingPoint = startingPoint;
        this.tripStatus = "requested";
        calPrice();
    }

    public Trip(Location startingPoint, Location destination, int price, String tripStatus, Integer passengerId, Integer driverId) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.price = price;
        this.tripStatus = tripStatus;
        this.passengerId = passengerId;
        this.driverId = driverId;
    }

    public Location getStartingPoint() {
        return startingPoint;
    }

    public int getPrice() {
        return price;
    }

    public Location getDestination() {
        return destination;
    }

    public String getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(String tripStatus) {
        this.tripStatus = tripStatus;
    }

    public void calPrice() {
        this.price = (int) (startingPoint.calculateDistance(destination)) * 10;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "startingPoint=" + startingPoint +
                ", destination=" + destination +
                ", price=" + price +
                ", tripStatus='" + tripStatus + '\'' +
                ", passengerId=" + passengerId +
                ", driverId=" + driverId +
                '}';
    }
}
