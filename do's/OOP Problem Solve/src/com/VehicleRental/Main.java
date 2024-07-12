package com.VehicleRental;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota","cr-v",2022,4);
        Truck truck = new Truck(2.5, "Ford","F-150",2020);

        System.out.println("Car Details");
        System.out.println("--------------------------");
        car.showDetails();
        System.out.println("Truck Details");
        System.out.println("--------------------------");
        truck.showDetails();

    }

}
