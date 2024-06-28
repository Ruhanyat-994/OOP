package com.Ruhanayt.oopLabct.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.print("Please Enter the Row Number:");
        int rowNumber = userInput.nextInt();
        System.out.print("Please Enter the Column Number:");
        int colNumber = userInput.nextInt();


        int [][] functionalArray = new int[rowNumber][colNumber];


        for(int i =0; i < functionalArray.length;i++)
        {
            for (int j =0; j<functionalArray.length;j++)
            {
                System.out.print("Enter row "+" "+(i+1)+"And Column"+" "+(j+1)+" :");
                functionalArray[i][j] = userInput.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(functionalArray));

    }
}
