package com.Ruhanayt.oopLabct.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] colSum = new int[3];
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += myArray[j][i]; // Note the change here
            }
            colSum[i] = sum;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Column " + (i + 1) + " sum: " + colSum[i]);
        }
    }
}
