import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static String[][] map = new String[10][10];

    static {
        for (String[] strings : map) {
            Arrays.fill(strings, "_");
        }
    }


    public static void printMap(String[][] map) {
        for (String[] strings : map) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }

    public static void chooseTrip() {
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
    }

    public static void main(String[] args) {


        while (true) {

            System.out.println("""
                1. register
                2. log in
                3. show map
                4. choose trip
                5.exit
                """);
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    printMap(map);
                    break;
                case 4:
                    chooseTrip();
                    break;
                case 5:
                    return;
            }
        }
    }
}
