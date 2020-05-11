package com.eis.conspect.java.patterns.creational.builder.builders;

import com.eis.conspect.java.patterns.creational.builder.cars.Type;
import com.eis.conspect.java.patterns.creational.builder.components.Engine;
import com.eis.conspect.java.patterns.creational.builder.components.GPSNavigator;
import com.eis.conspect.java.patterns.creational.builder.components.Transmission;
import com.eis.conspect.java.patterns.creational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder<T> {

    public void setType(Type type);

    public void setSeats(int seats);

    public void setEngine(Engine engine);

    public void setTransmission(Transmission transmission);

    public void setTripComputer(TripComputer tripComputer);

    public void setGPSNavigator(GPSNavigator gpsNavigator);

}
