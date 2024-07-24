import java.sql.SQLOutput;
import java.util.Scanner;

public class MyMedicineShop {
    public static void main(String[] args) {
        Scanner CustomerChoice = new Scanner(System.in);
        AlopathyDept Human = new AlopathyDept();
        VeterinaryDept Cattle = new VeterinaryDept();
        System.out.println("Hello Sir! What do you want?");
        System.out.println("Press A for Human Medicines\nPress B for Cattle Medicines");
        System.out.print("Choice:");

        String GivenType = CustomerChoice.nextLine().toUpperCase();
        // System.out.println(GivenType);
        String GivenPillType ;
        String PillName;
        String GasPillType;

        if(GivenType.equals("A")){
            System.out.println("Thank You! for your choice\nWe have collection of Anti-Histamin,Histamin,Bone-Pills and All Gas Tablets");
            System.out.print("Please Enter your PIll type:");
            GivenPillType = CustomerChoice.nextLine().toUpperCase();

            switch (GivenPillType) {

                case "ANTI-HISTAMIN" -> {
                    PillName = CustomerChoice.nextLine().toUpperCase();
                    Human.antiHistamin(PillName);
                }
                case "HISTAMIN" -> {
                    PillName = CustomerChoice.nextLine().toUpperCase();
                    Human.histamin(PillName);
                }
                case "BONE-PILLS" -> {
                    PillName = CustomerChoice.nextLine().toUpperCase();
                    Human.bonePills(PillName);
                }
                case "GAS-TABLETS" -> {
                    System.out.print("Which Type do you want?\n->");
                    GasPillType = CustomerChoice.nextLine().toUpperCase();
                    System.out.print("What Pills you need!\n->");
                    switch (GasPillType) {
                        case "PENTOPRAZOL" -> {
                            System.out.println("Enter");
                            PillName = CustomerChoice.nextLine().toUpperCase();
                            Human.pentoprazol(PillName);
                        }
                        case "OMEPRAZOL" -> {
                            PillName = CustomerChoice.nextLine().toUpperCase();
                            Human.omeprazol(PillName);
                        }
                        case "ISOMOPRAZOL" -> {
                            PillName = CustomerChoice.nextLine().toUpperCase();
                            Human.isomoprazol(PillName);
                        }
                    }
                }
            }
        }

    }
}
