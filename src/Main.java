import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void printMap(String[][] map) {
        for (String[] strings : map) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] map = new String[10][10];
        for (String[] strings : map) {
            Arrays.fill(strings, "_");
        }


        System.out.println("choose starting point: ");
        int startX = input.nextInt();
        int startY = input.nextInt();
        Location start = new Location(startX, startY);
        System.out.println("choose destination point: ");
        int destX = input.nextInt();
        int destY = input.nextInt();
        Location dest = new Location(destX, destY);
        Trip t1 = new Trip(start, dest);
        Passenger passenger = new Passenger("iman");
        passenger.request(t1);
        t1.calPrice();
        System.out.println(t1.getPrice());
        System.out.println(passenger.getTrips());

        map[startX][startY] = "s";
        map[destX][destY] = "d";

        printMap(map);

    }
}
