
Here's how you can implement the tasks in Java step by step:

### **Task 1**: Take a line input from the user that contains the name, ID, and CGPA.
### **Task 2**: Take a line input from the user that contains 3 int numbers as CT marks.
### **Task 3**: Create a `Student` object using the data and display the information.

---

### **Solution**:

```java
import java.util.Scanner;

class Student {
    String name;
    int id;
    float cgpa;
    float[] ctMarks;

    // Constructor for Student
    public Student(String name, int id, float cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + cgpa);
    }

    // Method to calculate and display the average CT marks
    public void calculate_marks() {
        float totalMarks = 0;
        for (float mark : ctMarks) {
            totalMarks += mark;
        }
        float averageMarks = totalMarks / ctMarks.length;
        System.out.println("CT Marks: ");
        for (float mark : ctMarks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage CT Marks: " + averageMarks);
    }

    // Setter for CT marks
    public void setCtMarks(float[] ctMarks) {
        this.ctMarks = ctMarks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Take input for name, id, and CGPA
        System.out.println("Enter Student Details (name, id, cgpa) separated by commas:");
        String studentInput = sc.nextLine();
        String[] studentDetails = studentInput.split(", ");
        String name = studentDetails[0];
        int id = Integer.parseInt(studentDetails[1]);
        float cgpa = Float.parseFloat(studentDetails[2]);

        // Task 2: Take input for CT marks
        System.out.println("Enter CT Marks (3 marks separated by commas):");
        String ctInput = sc.nextLine();
        String[] ctDetails = ctInput.split(", ");
        float[] ctMarks = new float[3];
        for (int i = 0; i < 3; i++) {
            ctMarks[i] = Float.parseFloat(ctDetails[i]);
        }

        // Task 3: Create a Student object and set the CT marks
        Student student = new Student(name, id, cgpa);
        student.setCtMarks(ctMarks);

        // Display student information
        student.display();

        // Calculate and display CT marks
        student.calculate_marks();

        sc.close();
    }
}
```

---

### **Explanation**:
1. **Task 1**:
   - We take the student's details as input in the format `"Abc, 101, 3.5"`, split the string, and extract the name, ID, and CGPA values.
   
2. **Task 2**:
   - We take the CT marks input in the format `"10, 12.5, 15.75"`, split the string, and store the marks in a `float[]` array.

3. **Task 3**:
   - We create a `Student` object with the extracted name, ID, and CGPA.
   - The `display()` method prints the student's name, ID, and CGPA.
   - The `calculate_marks()` method calculates the average of the CT marks and displays both the individual marks and the average.

---

### **Sample Input**:
```
Enter Student Details (name, id, cgpa) separated by commas:
Abc, 101, 3.5
Enter CT Marks (3 marks separated by commas):
10, 12.5, 15.75
```

### **Sample Output**:
```
Student Name: Abc
Student ID: 101
Student CGPA: 3.5
CT Marks: 
10.0 12.5 15.75 
Average CT Marks: 12.75
```

Let me know if you need further clarification or adjustments!











# File I/O
Here are the solutions for both tasks in Java:

---

### **Task 1**: Java application that takes two numbers as input, calculates the sum, and throws an exception if any number is negative.

```java
import java.security.InvalidParameterException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user for two numbers
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();

            // Check for negative numbers and throw InvalidParameterException
            if (num1 < 0 || num2 < 0) {
                throw new InvalidParameterException("Negative numbers are not allowed.");
            }

            // Calculate and display the sum
            int sum = num1 + num2;
            System.out.println("The sum of the two numbers is: " + sum);

        } catch (InvalidParameterException e) {
            // Handle the exception for negative numbers
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
```

---

### **Explanation for Task 1**:
- The program prompts the user for two integers.
- If any input is negative, an `InvalidParameterException` is thrown, and the message `"Negative numbers are not allowed."` is displayed.
- If both inputs are valid (non-negative), the sum of the two numbers is calculated and displayed.

---

### **Task 2**: Java application to read comma-separated numbers from `input.txt`, calculate the sum, and write the result to `output.txt`.

```java
import java.io.*;

public class SumFromFile {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            // Reading the input.txt file
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            String line = reader.readLine();
            reader.close();

            // Splitting the numbers and parsing them
            String[] numberStrings = line.split(",");
            int sum = 0;
            for (String number : numberStrings) {
                sum += Integer.parseInt(number.trim());
            }

            // Writing the result to output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.write("Sum: " + sum);
            writer.newLine();
            writer.close();

            System.out.println("The sum has been written to " + outputFileName);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **Explanation for Task 2**:
- The program reads the contents of the file `"input.txt"`, which contains numbers separated by commas.
- It parses these numbers, sums them, and writes the result to a new file called `"output.txt"`.
- The program handles any potential `IOException` during file reading or writing.

---

### **Example Input for Task 2**:
Contents of `input.txt`:
```
10, 20, 30, 40, 50
```

### **Example Output**:
Contents of `output.txt`:
```
Sum: 150
```

Both solutions should work in a standard Java environment. Let me know if you need any further modifications!


---

Here are more Java File I/O and exception handling questions similar to the ones in your university course, along with answers.

---

### **1. Read and store multiple student details from a file.**
**Problem**: Write a Java program to read student names, IDs, and CGPAs from a file and store them in an array of objects.

**Solution**:
```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadStudents {h
    public static void main(String[] args) {
        try {
            File file = new File("Files/Students.txt");
            Scanner sc = new Scanner(file);
            Student[] students = new Student[10];
            int i = 0;

            while (sc.hasNext()) {
                String name = sc.next();
                int id = sc.nextInt();
                double cgpa = sc.nextDouble();
                students[i++] = new Student(name, id, cgpa);
            }

            for (Student s : students) {
                if (s != null) {
                    System.out.println("Name: " + s.name + " ID: " + s.id + " CGPA: " + s.cgpa);
                }
            }

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
```

---

### **2. Write to a file using PrintWriter.**
**Problem**: Write a Java program that writes the details of three students to a file using `PrintWriter`.

**Solution**:
```java
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteStudents {
    public static void main(String[] args) {
        try {
            File file = new File("Files/StudentDetails.txt");
            PrintWriter out = new PrintWriter(file);
            Student[] students = {
                new Student("Alice", 201, 3.6),
                new Student("Bob", 202, 3.7),
                new Student("Charlie", 203, 3.8)
            };

            for (Student s : students) {
                out.println("Name: " + s.name + " ID: " + s.id + " CGPA: " + s.cgpa);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
}
```

---

### **3. Exception handling with multiple catch blocks.**
**Problem**: Write a Java program that performs division and handles both `ArithmeticException` and `ArrayIndexOutOfBoundsException`.

**Solution**:
```java
import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int[] arr = new int[5];

        try {
            System.out.print("Enter a number to divide: ");
            int b = sc.nextInt();
            int c = a / b;  // May throw ArithmeticException
            arr[10] = 24;   // May throw ArrayIndexOutOfBoundsException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        } finally {
            System.out.println("End of program.");
        }
        sc.close();
    }
}
```

---

### **4. Count the number of words in a file.**
**Problem**: Write a Java program that reads a file and counts the total number of words.

**Solution**:
```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        int wordCount = 0;
        try {
            File file = new File("Files/A.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                sc.next();
                wordCount++;
            }

            System.out.println("Total number of words: " + wordCount);
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **5. Write a program to reverse the content of a file.**
**Problem**: Write a Java program that reads a file and prints its content in reverse order.

**Solution**:
```java
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFileContent {
    public static void main(String[] args) {
        try {
            File file = new File("Files/A.txt");
            Scanner sc = new Scanner(file);
            Stack<String> stack = new Stack<>();

            while (sc.hasNextLine()) {
                stack.push(sc.nextLine());
            }

            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **6. Copy content from one file to another using `BufferedReader` and `BufferedWriter`.**
**Problem**: Write a Java program to copy content from one file to another using `BufferedReader` and `BufferedWriter`.

**Solution**:
```java
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Files/A.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("Files/B.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **7. Handling `FileNotFoundException`.**
**Problem**: Write a Java program that attempts to open a non-existent file and handles the `FileNotFoundException`.

**Solution**:
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandleFileNotFound {
    public static void main(String[] args) {
        try {
            File file = new File("Files/NonExistent.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }
    }
}
```

---

### **8. Count the number of characters, words, and lines in a file.**
**Problem**: Write a program to count the number of characters, words, and lines in a file.

**Solution**:
```java
import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        int lines = 0, words = 0, characters = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("Files/A.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                words += line.split("\\s+").length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + characters);
    }
}
```

---

### **9. Write a program to append data to an existing file.**
**Problem**: Write a program that appends a new line of text to an existing file.

**Solution**:
```java
import java.io.*;

public class AppendToFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Files/A.txt", true))) {
            writer.newLine();
            writer.write("This line is appended.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **10. Write a program to create a file and check if it exists.**
**Problem**: Write a Java program that creates a new file and checks if it exists.

**Solution**:
```java
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("Files/NewFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

These examples cover many typical university-level File I/O and exception handling problems in Java. Let me know if you'd like further explanations or more problems!

---

### **1. Write a program to read a file line by line.**
**Problem**: Write a Java program that reads a file and prints each line.

**Solution**:
```java
import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **2. Write a program to write data to a file.**
**Problem**: Write a Java program that writes data to a file.

**Solution**:
```java
import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("Java File I/O is fun!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **3. Copy content from one file to another.**
**Problem**: Write a program that copies the content of one file to another.

**Solution**:
```java
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **4. Count the number of lines in a file.**
**Problem**: Write a program that counts the number of lines in a file.

**Solution**:
```java
import java.io.*;

public class LineCount {
    public static void main(String[] args) {
        int lineCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            while (br.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total number of lines: " + lineCount);
    }
}
```

---

### **5. Read and write binary data from/to a file.**
**Problem**: Write a Java program that reads and writes binary data.

**Solution**:
```java
import java.io.*;

public class BinaryReadWrite {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};

        // Writing binary data
        try (FileOutputStream fos = new FileOutputStream("binary.dat")) {
            fos.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading binary data
        try (FileInputStream fis = new FileInputStream("binary.dat")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print(byteData + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **6. Append data to an existing file.**
**Problem**: Write a program to append data to a file.

**Solution**:
```java
import java.io.*;

public class FileAppend {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true))) {
            bw.write("Appending this line to the file.");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **7. Serialize an object to a file and deserialize it.**
**Problem**: Write a program that serializes and deserializes an object.

**Solution**:
```java
import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Name: " + deserializedPerson.name + ", Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **8. Find the largest word in a file.**
**Problem**: Write a program that reads a file and finds the largest word.

**Solution**:
```java
import java.io.*;
import java.util.StringTokenizer;

public class LargestWord {
    public static void main(String[] args) {
        String largestWord = "";
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    String word = st.nextToken();
                    if (word.length() > largestWord.length()) {
                        largestWord = word;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Largest word: " + largestWord);
    }
}
```

---

### **9. Read a CSV file and print data.**
**Problem**: Write a program that reads data from a CSV file.

**Solution**:
```java
import java.io.*;

public class ReadCSV {
    public static void main(String[] args) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **10. Write data to a CSV file.**
**Problem**: Write a program that writes data to a CSV file.

**Solution**:
```java
import java.io.*;

public class WriteCSV {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.csv"))) {
            bw.write("Name,Age,City");
            bw.newLine();
            bw.write("John,25,New York");
            bw.newLine();
            bw.write("Alice,30,Los Angeles");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **11. Write a program to delete a file.**
**Problem**: Write a Java program to delete a file from the system.

**Solution**:
```java
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("fileToDelete.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
```

---

### **12. Read and write data using `FileReader` and `FileWriter`.**
**Problem**: Write a Java program that uses `FileReader` and `FileWriter`.

**Solution**:
```java
import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("File I/O using FileReader and FileWriter");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("output.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

---

### **13. Check if a file exists.**
**Problem**: Write a Java program to check whether a file exists or not.

**Solution**:
```java
import java.io.File;

public class FileExistenceCheck {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist");
        }
    }
}
```

---

### **14. List all files in a directory.**
**Problem**: Write a program to list all files in a specified directory.

**Solution**:
```java
import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("your-directory-path");
        if (dir.isDirectory()) {
            String[] files = dir.list();
            if (files !=