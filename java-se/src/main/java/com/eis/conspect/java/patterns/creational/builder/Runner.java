package com.eis.conspect.java.patterns.creational.builder;

import com.eis.conspect.java.patterns.creational.builder.builders.CarBuilder;
import com.eis.conspect.java.patterns.creational.builder.builders.CarManualBuilder;
import com.eis.conspect.java.patterns.creational.builder.cars.Car;
import com.eis.conspect.java.patterns.creational.builder.cars.Manual;
import com.eis.conspect.java.patterns.creational.builder.director.Director;

public class Runner {

    public static void main(String...args) {

        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car sportCar = builder.getResult();
        System.out.println("Car built:\n" + sportCar.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        carManual.print();

    }
}