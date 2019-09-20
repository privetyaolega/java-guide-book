package com.eis.conspect.java.patterns.creational.builder.cars;

import com.eis.conspect.java.patterns.creational.builder.components.Engine;
import com.eis.conspect.java.patterns.creational.builder.components.GPSNavigator;
import com.eis.conspect.java.patterns.creational.builder.components.Transmission;
import com.eis.conspect.java.patterns.creational.builder.components.TripComputer;

/**
 * Руководство автомобиля — это второй продукт. Заметьте, что руководство и сам
 * автомобиль не имеют общего родительского класса. По сути, они независимы.
 */
public class Manual {

    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;


    public Manual(Car car) {
        this.type = car.getType();
        this.seats = car.getSeats();
        this.engine = car.getEngine();
        this.transmission = car.getTransmission();
        this.tripComputer = car.getTripComputer();
        this.gpsNavigator = car.getGpsNavigator();
    }

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public void print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        System.out.println(info);
    }
}
