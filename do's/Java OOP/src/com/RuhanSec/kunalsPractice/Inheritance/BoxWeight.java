package com.RuhanSec.kunalsPractice.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight =-1;

    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }
    


    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); // saying call the parent class constractor
        this.weight = weight;

    }

}
