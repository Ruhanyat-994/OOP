package com.Ruhanayt.oopLabct.practice;

public class ColumnMax {
    public static void main(String[] args) {

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] colMax = new int[3];
        for (int i = 0; i < 3; i++) {
            int max = myArray[0][i]; // Initialize max to the first element of the column
            for (int j = 0; j < 3; j++) {
                if (myArray[j][i] > max) {
                    max = myArray[j][i];
                }
            }
            colMax[i] = max;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Column " + (i + 1) + " max: " + colMax[i]);
        }
    }
}
