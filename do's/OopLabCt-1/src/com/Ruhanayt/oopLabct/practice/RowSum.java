package com.Ruhanayt.oopLabct.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.print("Please Enter the Row Number:");
        int rowNumber = userInput.nextInt();
        System.out.print("Please Enter the Column Number:");
        int colNumber = userInput.nextInt();


        int [][] functionalArray = new int[rowNumber][colNumber];

        int sum =0;



        for(int i =0; i < functionalArray.length;i++)
        {
            sum =0;

            for (int j =0; j<colNumber;j++)
            {
                System.out.print("Enter row "+" "+(i+1)+"And Column"+" "+(j+1)+" :");
                functionalArray[i][j] = userInput.nextInt();
                sum += functionalArray[i][j];

            }
            System.out.print("The sum of row "+(i+1)+" is: ");

            System.out.println(sum);
        }
        System.out.println(Arrays.deepToString(functionalArray));
        

    }
}
