package com.FourthQuestion;

import java.util.Random;
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        mainFunctionality();

    }
    public static void  mainFunctionality(){
        double length;double width;
        System.out.print("Enter dimensions of rectangle(ex: a <space> b): ");
        Scanner inputTaker = new Scanner(System.in);
        Rectangle dimensions = new Rectangle();
        length=inputTaker.nextDouble() ;
        width = inputTaker.nextDouble();

        dimensions.length= (int) Math.round(length);
        dimensions.width = (int) Math.round(width);

        //System.out.println(dimensions.length);
        int choice;
        System.out.println("Please enter a choice: \n1. Area of rectangle.\n2.Perimeter of rectangle. ");
        
        System.out.print("Your Choice:");
        choice = inputTaker.nextInt();
        if (choice == 1)
        {
            dimensions.CalculateArea(dimensions.length,dimensions.width);

        } else if (choice == 2) {
            dimensions.CalculatePerimeter(dimensions.length,dimensions.width);
        }


    }
}
