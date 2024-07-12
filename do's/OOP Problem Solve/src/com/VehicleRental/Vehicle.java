package com.VehicleRental;
/*Define a superclass Vehicle with properties make, model, and year.
Derive classes Car and Truck from Vehicle.
 Each subclass should have additional properties (numDoors for Car, cargoCapacity for Truck).
 Implement methods to display rental details including specific information for cars and trucks.*/

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    String getMake(){
        return make;
    }
    String getModel(){
        return model;
    }
    int getYear(){
        return year;
    }

    public void showDetails(){
        System.out.println("The Company is : "+make);
        System.out.println("The Model is : "+model);
        System.out.println("The year of Born : "+year);

    }

}
