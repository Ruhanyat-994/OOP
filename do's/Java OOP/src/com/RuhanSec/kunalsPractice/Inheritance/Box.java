package com.RuhanSec.kunalsPractice.Inheritance;

public class Box {
    private double length ;
    double height;
    double width;

    // initial constractor
    Box(){
        this.height=-1;
        this.length = -1;
        this.width=-1;

        super();
    }

    // cube
    Box(double side){
        this.height=side;
        this.width=side;
        this.length=side;

    }

    Box(double length,double height,double width)
    {
        this.length= length;
        this.height = height;
        this.width= width;
    }

    Box(Box old){
        this.length = old.length;
        this.width= old.width;
        this.height = old.height;

    }

    public void information(){
        System.out.println("The info of the box!");
    }


    public static class BoxWeight extends Box{

    }
}
