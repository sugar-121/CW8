public class Trip {
    private Location startingPoint;
    private Location destination;
    private int price;

    public Trip(Location startingPoint , Location destination) {
        this.destination = destination;
        this.startingPoint = startingPoint;
        calPrice();
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

    public void calPrice(){
        this.price =(int)(startingPoint.calculateDistance(destination)) * 10;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "startingPoint=" + startingPoint +
                ", destination=" + destination +
                ", price=" + price +
                '}';
    }
}
