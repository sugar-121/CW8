package util;

import repository.PassengerRepository;
import repository.TripRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ApplicationContext {
    private static ApplicationContext CTX;
    private Connection connection;
    private PassengerRepository pr;
    private TripRepository tr;

    private ApplicationContext() {
    }

    //singleton design pattern:
    public static ApplicationContext getInstance() {
        if (CTX == null) {
            CTX = new ApplicationContext();
        }
        return CTX;
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(
                        ApplicationProperties.DATABASE_URL,
                        ApplicationProperties.DATABASE_USER,
                        ApplicationProperties.DATABASE_PASSWORD
                );
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public PassengerRepository getPassengerRepository() {
        if (pr == null) {
            pr = new PassengerRepository();
        }
        return pr;
    }

    public TripRepository getTripRepository() {
        if (tr == null) {
            tr = new TripRepository();
        }
        return tr;
    }
}
