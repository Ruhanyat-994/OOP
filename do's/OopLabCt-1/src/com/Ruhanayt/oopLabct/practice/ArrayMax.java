package com.Ruhanayt.oopLabct.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please Enter the Row Number:");
        int rowNumber = userInput.nextInt();
        System.out.print("Please Enter the Column Number:");
        int colNumber = userInput.nextInt();

        int[][] functionalArray = new int[rowNumber][colNumber];

        for (int i=0;i<functionalArray.length;i++)
        {
            for (int j =0 ; j<functionalArray.length;j++) {
                System.out.print("Enter row " + " " + (i + 1) + " And Column" + " " + (j + 1) + " :");
                functionalArray[i][j] = userInput.nextInt();
            }
        }
        // storing first array value as min and max to compare it wit other value

        int maxInFunctionalArray = functionalArray[0][0];
        int minInFunctionalArray = functionalArray[0][0];

        for (int i =0;i<functionalArray.length;i++){
            for (int j=0;j<functionalArray[i].length;j++)
            {


                if(functionalArray[i][j] > maxInFunctionalArray)
                {
                    maxInFunctionalArray = functionalArray[i][j];
                }
                if(functionalArray[i][j] < minInFunctionalArray)
                {
                    minInFunctionalArray = functionalArray[i][j];
                }


            }


        }
        System.out.println(Arrays.deepToString(functionalArray));
        System.out.println("The maximum number in the array is : "+maxInFunctionalArray);
        System.out.println("The minimum number in the array is : "+minInFunctionalArray);
        userInput.close();


    }
}
