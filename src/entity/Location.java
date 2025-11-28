package entity;

public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double calculateDistance(Location location){
        int x = Math.abs(this.x - location.x );
        int y = Math.abs(this.y - location.y );
        double distancePow2 = Math.pow(x,2) + Math.pow(y,2);
        double distance = Math.sqrt(distancePow2);
        return distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
