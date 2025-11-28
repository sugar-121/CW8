import entity.Passenger;
import entity.Trip;
import repository.PassengerRepository;
import repository.TripRepository;
import util.ApplicationContext;

import java.sql.SQLException;

public class PassengerVersion {
    public static void main(String[] args) throws SQLException {
        Passenger p;
        PassengerRepository pr = new PassengerRepository();
        Trip t;
        TripRepository tr = new TripRepository();
        //tr.save(new Trip(new Location(3,1), new Location(8,9)));

        /*pr.save(new Passenger("abbas"));
        pr.save(new Passenger("asghar"));
        pr.save(new Passenger("akbar"));*/

        p = pr.findById(1);
        System.out.println(p);
        System.out.println(pr.findById(2));
        System.out.println(pr.findById(3));

        System.out.println();
        System.out.println(tr.findById(1));

        ApplicationContext.getInstance().getConnection().close();
    }
}
