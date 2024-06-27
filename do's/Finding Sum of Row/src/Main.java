import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("Please Enter the Row number: ");
        Scanner scanf = new Scanner(System.in);
        int rowNumber = scanf.nextInt();
        System.out.print("Please Enter the Column number: ");
        int colNumber = scanf.nextInt();

        int[][] array = new int[rowNumber][colNumber];

        int sum = 0;

        for(int i =0;i<rowNumber;i++)
        {
            sum = 0;
            for (int j =0;j<colNumber;j++)
            {
                System.out.print("Enter row "+" "+(i+1)+" And Column"+" "+(j+1)+" :");
                array[i][j]= scanf.nextInt();
                sum+= array[i][j];
            }
            System.out.println(Arrays.deepToString(array));
            System.out.println("The Sum of Row "+i+" is "+sum);
        }
    }
}