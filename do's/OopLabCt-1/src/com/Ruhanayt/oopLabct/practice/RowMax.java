package com.Ruhanayt.oopLabct.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RowMax {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please Enter the Row Number: ");
        int rowNumber = userInput.nextInt();
        System.out.print("Please Enter the Column Number: ");
        int colNumber = userInput.nextInt();

        int[][] functionalArray = new int[rowNumber][colNumber];

        for (int i = 0; i < functionalArray.length; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print("Enter row " + (i + 1) + " and column " + (j + 1) + " : ");
                functionalArray[i][j] = userInput.nextInt();
            }
        }

        System.out.println("Array: " + Arrays.deepToString(functionalArray));

        for (int i = 0; i < functionalArray.length; i++) {
            int max = functionalArray[i][0]; // Initialize max to the first element of the row
            for (int j = 1; j < colNumber; j++) {
                if (functionalArray[i][j] > max) {
                    max = functionalArray[i][j];
                }
            }
            System.out.println("The max of row " + (i + 1) + " is: " + max);
        }

        userInput.close();
    }
}
