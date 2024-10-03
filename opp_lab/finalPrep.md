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
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a BufferedReader to read the file
            BufferedReader reader = new BufferedReader(new FileReader("Hello.txt"));

            String line;  // Variable to hold each line of the file
            String searchString = "hello world"; // The pattern/string to search for
            boolean isPatternFound = false;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Check if the current line contains the string/pattern
                if (line.contains(searchString)) {
                    System.out.println("Pattern found: " + searchString);
                    isPatternFound = true;
                    break; // Stop searching once the pattern is found
                }
            }

            if (!isPatternFound) {
                System.out.println("Pattern not found.");
            }

            // Close the BufferedReader to release resources
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```
