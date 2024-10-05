

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
## File details
```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("Hello.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine())!= null){
                System.out.println("File name: " + file.getName());
                System.out.println("Absolute path: " + file.getAbsolutePath());
                System.out.println("Writeable: " + file.canWrite());
                System.out.println("Readable " + file.canRead());
                System.out.println("File size in bytes " + file.length());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
```
## Task-1
**Assume a file “input.txt” contains comma-separated numbers. Write an application to read the
numbers from the “input.txt” file, parse those numbers, calculate the summation, and then write the result to a different file name “output.txt”.**

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writeFile = new FileWriter("input.txt");
            writeFile.write("15,45,65,45,34");
            writeFile.close();
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line = reader.readLine();
            reader.close();

            if(line != null ){
                String[] numbers = line.split(",");
                double sum =0;
                for(String number:numbers){
                    sum+= Double.parseDouble(number.trim());
                }
                FileWriter writingOutput = new FileWriter("Output.txt");
                writingOutput.write("The sum is : "+sum);
                writingOutput.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            System.out.println("Invalid Number format in input file");
        }

    }
}
```

## ArrayList<>
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("ferari");
        cars.add("lexus");
        cars.add("toyota");
        cars.add(0,"majda");
        cars.set(0,"BMW");
        System.out.println(cars);
        System.out.println(cars.get(3)); // get
        System.out.println(cars.size()); // Size


    }
}
```
## Looping through arraylist
```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("ferari");
        cars.add("lexus");
        cars.add("toyota");
      for(int i = 0; i<cars.size(); i++){
          System.out.println(cars.get(i));
      }
      // same thing using for each loop
      for(String i : cars){
          System.out.println(i);
      }
    }
}
```

## Sorting ArrayList
```java
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();


        cars.add("Volvo");
        cars.add("ferari");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("lexus");
        cars.add("toyota");
        Collections.sort(cars);

        for (String i : cars){
            System.out.println(i);
        }
    }
}
```

## Splitting string
```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("Hello.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;
            boolean isPatternFound = false;

            while((line = reader.readLine())!=null){
              String[] carier = line.split(" , ");
                for(String value : carier){
                    System.out.print(value);
                }
            }
            reader.close();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }
}
```
## String Related Problem {Ct marks calculation}
```java
import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private float cgpa;
    private float totalCTMarks;

    public Student(String name, int id, float cgpa){
        this.name= name;
        this.id = id;
        this.cgpa=cgpa;

    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("CGPA: "+cgpa);
    }

    public void calculate_marks(float[] ctmarks){
        totalCTMarks=0;
        float max1= Math.max(ctmarks[0],Math.max(ctmarks[1],ctmarks[2]));
        float min1= Math.min(ctmarks[0],Math.min(ctmarks[1],ctmarks[2]));
        float middle1 = ctmarks[0]+ctmarks[1]+ctmarks[2]-max1-min1;

        float averageBestTwo = (max1+middle1)/2;
        for (float mark: ctmarks){
            totalCTMarks+= mark;

        }
        System.out.println("Total CT Marks: "+totalCTMarks);
        System.out.println("Best One CT Mark: "+totalCTMarks);

    }
    import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student details (name, id, cgpa) separated by commas:");
            String studentInput = sc.nextLine();
            String[] studentDetails = studentInput.split(", ");
            String name = studentDetails[0];
            int id = Integer.parseInt(studentDetails[1]);
            float cgpa = Float.parseFloat(studentDetails[2]);

            System.out.println("Enter 3 CT marks separated by commas: ");
            String ctInput = sc.nextLine();
            String[] ctMarksInput = ctInput.split(", ");

            float[] ctMarks = new float[3];
            for (int i =0;i<3;i++){
                ctMarks[i] = Float.parseFloat(ctMarksInput[i]);
            }
            Student student = new Student(name,id,cgpa);
            student.display();
            student.calculate_marks(ctMarks);
        }
    }

}

```


