## Matching strings (case_insensitive)
```java
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hello World",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("This is From Hello world");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Match Found");
        }else{
            System.out.println("Match not found");
        }
    }
}
```


## finding pattern through file read
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Pattern you want to check");
        String searchString = scan.nextLine().toLowerCase();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Hello.txt"));
            String line;


            boolean isPatternFound = false;

            while ((line = reader.readLine())!= null){
                if(line.contains(searchString)){
                    System.out.println("Your Pattern is : "+searchString);
                    isPatternFound = true;
                    break;
                }
            }
            if(!isPatternFound){
                System.out.println("Pattern not found");
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("Your Pattern is in the file!");
        }
        scan.close();
    }
}
```
