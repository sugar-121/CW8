CREATE DATABASE CW8;
DROP TABLE Passenger;
CREATE TABLE Passenger
(
    id      SERIAL,
    name    VARCHAR(10),
    trip_id INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (trip_id) REFERENCES Trip (id)
);

DROP TABLE Trip;
CREATE TABLE Trip
(
    id            SERIAL,
    destinationX   INTEGER,
    destinationY   INTEGER,
    startingPointX INTEGER,
    startingPointY INTEGER,
    price         INTEGER,
    PRIMARY KEY (id)

);