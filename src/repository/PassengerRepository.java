package repository;

import entity.Passenger;
import util.ApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PassengerRepository {
    Connection connection = ApplicationContext.getInstance().getConnection();


    public void save(Passenger p) {
        try {
            PreparedStatement ps = connection.prepareStatement(
                    "insert into passenger (name) values (?)");
            ps.setString(1, p.getName());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Passenger findById(Integer id) {
        try {
            //join bezan ba trip
            PreparedStatement ps = connection.prepareStatement("select * from passenger where id = ?");
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                //int id1 = resultSet.getInt("id");
                String name = resultSet.getString("name");
                return new Passenger(id, name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
