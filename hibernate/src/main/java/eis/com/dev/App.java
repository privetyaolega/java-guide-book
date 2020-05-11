package eis.com.dev;

import eis.com.dev.models.Car;

public class App {
    public static void main(String[] args) {

        CarHelper carHelper = new CarHelper();
        carHelper.addCar(new Car(200, "SuperCar xzt123"));

    }
}