package com.FourthQuestion;

public class Rectangle {
    int length;
    int width;

    public int CalculateArea(int length,int width){
        this.length = length;
        this.width  = width;
        System.out.println("The Area of the Rectangle is : "+(length*width));
        return 0;
    }
    public int CalculatePerimeter(int length,int width){
        this.length = length;
        this.width  = width;
        System.out.println("The Perimeter of the Rectangle is : "+(2*(length+width)));
        return 0;
    }

}
