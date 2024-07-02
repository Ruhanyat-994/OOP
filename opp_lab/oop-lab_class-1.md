# OOP Lab Class 1

## Evaluation Criteria

- **Online & Lab Performance**
  - \( (n-1) \) best performances will be considered.

- **Class Tests (CT)**
  - \( (n-1) \) best test scores will be considered.

- **Assignments**
  - Assignment 2 will be evaluated and counted.

### Difference Between Structure and Object

```plaintext
In C we used structure but we can't call method for each class for that reason we use oop where we can create several mathods or class and call it any time!
```

### Setup

```plaintext
Process
--------------------------------------------
1. Setup JDK and JRE 
2. Then install IDE 

```

### Class Name Convention

```plaintext
---------------------------------------------
1. No space between words
2. Start always Capital letter
```

### Java Concepts

### 1. Class Declaration
```java
public class lab_class1 {
}
```
- **public**: This is an access modifier. When a class is declared as `public`, it means that the class can be accessed from any other class.
- **class**: This keyword is used to declare a class in Java.
- **lab_class1**: This is the name of the class. By convention, class names in Java start with an uppercase letter, so it would be more typical to name it `LabClass1`.

### 2. Main Method
```java
public static void main(String[] args) {
    System.out.println("Hello world");
}
```
- **public**: This is an access modifier. When a method is declared as `public`, it means that the method can be called from outside the class.

- **static**: This keyword indicates that the method belongs to the class, rather than an instance of the class. This means you can call the `main` method without creating an object of the class.
  
- **void**: This means that the method does not return any value.
  
- **main**: This is the name of the method. The `main` method is special in Java because it is the entry point for the application. When you run a Java program, the JVM looks for the `main` method to start execution.
  
- **String[] args**: This is an array of `String` objects. It stores command-line arguments that can be passed to the program when it is executed.
  
- **System.out.println("Hello world")**: This line prints the string "Hello world" to the standard output, which is typically the console. 
  - **System**: This is a class from the `java.lang` package.
  - **out**: This is a static member of the `System` class, which is an instance of `PrintStream`. It represents the standard output stream.
  - **println**: This is a method of the `PrintStream` class that prints the argument passed to it (in this case, "Hello world") followed by a new line.

### Putting It All Together
Here's the corrected and formatted Java program:
```java
public class LabClass1 { // Corrected class name to follow convention
    public static void main(String[] args) {
        System.out.println("Hello world"); // Prints "Hello world" to the console
    }
}
```
This program defines a class named `LabClass1` with a `main` method that serves as the entry point of the application. When executed, it prints "Hello world" to the console.

```java
public class lab_class1 {
}

    public static void main(String[] args) {

    }
}

```  

```plaintext
------------------------------------------------
3. After the public class we can just type psvm and the void main will be automated

4. Function is called as Method (A method is a function which is a part of a class )in JAVA.
5.  System.out.println(); // This is just a Print function here called as method.
```

#### Printing Hello world
```java

public class lab_class1 {
}

    public static void main(String[] args) {
        System.out.println("Hello world");

    }
}

``` 

#### Printing Sum   

```java

public class lab_class1 {


    public static void main(String[] args) {

        int sum;
        int a=23 ,b=34;
        sum = a+b;
        System.out.println("The sum is ="+(sum));

    }
}
```
```plaintext
--------------------------------
5. If we do this System.out.println("The sum is ="+sum);

6. But here java thinks that the first datatype is string so the 2nd will string as well !

7. To differentiate this we can use a bracket  System.out.println("The sum is ="+(sum));

8. If we don't assign a value to a variable and print them java will not give us an error because it gives the variable a default value.

```

#### Problem with Float
```java
public class lab_class1 {


    public static void main(String[] args) {

        float sum;
        float a=23.23f , b=34.23f;
        sum = (a+b);

        System.out.println("The sum is = " + (sum));

    }
}

```
```plaintext
9. We have to use a "f" sign after the value that we input
-> float a=23.23f , b=34.23f;

```
#### Arrays

> Syntax  

```java
int[] sampleArray;
sampleArray = new int[10];

or

int[] sampleArray = new int[];

or 

int[] sampleArray = new int[]{1,2,3,4,5};

or 

int[] sampleArray = {1,2,3,4,5};


```

#### Find the first 10 even number
```java
public class lab_class1 {


    public static void main(String[] args) {


        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }



    }
}
```

#### Find the max an min from an array

```java
array -> {2,3,9,8,13,1,5,19,15,0,4}

public class lab_class1 {


    public static void main(String[] args) {

        int[] array = {2,3,9,8,13,1,5,19,15,0,4};

        int max = array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i] > max)
            {
                 max = array[i];

            }
            else
            {
                 System.out.println(array);
            }
        }





    }
}


```

### Class & Object

```java
public class lab_class1 {
    String name;
    int id;
    
    public static void main(String[] args) {
        lab_class1 S1 = new lab_class1();// this is an object
        
        lab_class1 S2 = new lab_class1();// this is also an object

        S1.name = "ruhan sec";
        System.out.println(S1.name);
        
    }
}
```
```plaintext
--------------------------------------------
10. Each object has each properties
11. One object can't use another object

```
