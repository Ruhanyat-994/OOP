package com.VehicleRental;

public class Truck extends Vehicle {

    double cargoCapacity;
    Truck(double cargoCapacity,String make,String model,int year ){

        super(make,model,year);
        this.cargoCapacity = cargoCapacity;

    }
    double getCargoCapacity(){
        return cargoCapacity;
    }
    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Cargocapacity is :"+cargoCapacity+" tons");
    }

}
