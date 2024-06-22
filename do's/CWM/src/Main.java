import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Please Enter your title:");
        String scanfValueStored = scanf.nextLine().trim().toLowerCase();

        System.out.println(scanfValueStored);
    }
} 