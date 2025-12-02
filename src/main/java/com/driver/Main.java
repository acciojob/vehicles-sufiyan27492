package com.driver;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Generic Vehicle");
        vehicle.move(40, 90);
        vehicle.steer(30);
        vehicle.stop();

        System.out.println("--------------------");

        Car car = new Car("Honda City", 4, 4, 5, true, "Sedan", 5);
        car.changeGear(2);
        car.changeSpeed(60, 0);

        System.out.println("--------------------");

        F1 f1 = new F1("Red Bull F1", true);
        f1.accelerate(100);
        f1.accelerate(80);
        f1.accelerate(-200);

        System.out.println("--------------------");

        Boat boat = new Boat("Titanic", 3000);
        System.out.println("Boat name: " + boat.getVehicleName());
        System.out.println("Boat capacity: " + boat.getVehicleCapacity());
    }
}
