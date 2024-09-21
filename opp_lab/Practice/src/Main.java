import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("HackersMonument.txt",true);
            myWriter.write("\ntry to hack me😁😁");
            myWriter.close();

        }catch(IOException err){
            System.out.println("An error occurred");
            err.printStackTrace();
        }
    }
    }