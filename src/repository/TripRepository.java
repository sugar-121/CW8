package repository;

import entity.Location;
import entity.Trip;
import util.ApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TripRepository {
    private final String insert = """
            insert into Trip (destinationX, destinationY, startingPointX, startingPointY, price, trip_status)
            values (?, ?, ?, ?, ?, ?)
            """;
    Connection connection = ApplicationContext.getInstance().getConnection();

    public void save(Trip t) {
        try {
            PreparedStatement ps = connection.prepareStatement(insert);
            ps.setInt(1, t.getDestination().getX());
            ps.setInt(2, t.getDestination().getY());
            ps.setInt(3, t.getStartingPoint().getX());
            ps.setInt(4, t.getStartingPoint().getY());
            ps.setInt(5, t.getPrice());
            ps.setString(6, t.getTripStatus());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Trip findById(Integer id) {
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "select * from trip where id = ?");

            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                Location s = new Location(resultSet.getInt("startingPointX"),
                        resultSet.getInt("startingPointY"));
                Location d = new Location(resultSet.getInt("destinationX"),
                        resultSet.getInt("destinationY"));
                return new Trip(
                        s,
                        d,
                        resultSet.getInt("price"),
                        resultSet.getString("trip_status"),
                        resultSet.getInt("passenger_id"),
                        resultSet.getInt("driver_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
