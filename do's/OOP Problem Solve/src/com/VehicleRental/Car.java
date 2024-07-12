package com.VehicleRental;

public class Car extends Vehicle{
    public int numDoors;
     Car(String make,String model,int year,int numDoors){
        super(make,model,year);
        this.numDoors=numDoors;

    }
    public int getNumDoors(){
         return numDoors;
    }
    @Override
   public void showDetails(){
         super.showDetails();
        System.out.println("The number of doors are : "+ numDoors);
    }
}
