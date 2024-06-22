# Lab class 2

#### Taking input from user

```java


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a ,b ;
        float c;
        String name;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        a = sc.nextInt();
        c = sc.nextFloat();
        b = sc.nextInt();
        name = sc1.nextLine();

        System.out.println("a value: " + a);
        System.out.println("b value: " + b);
        System.out.println("c value: " + c);
        System.out.println("name is :"+ name);



    }
}

```

- We will use nextLine() to use string

#### Arrays

##### Enhanced for loops

```java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] sampleArray = new int[];
        for(int x: sampleArray)
        {
            x= sc.nextInt();
        }
    }
}
```

- **Enhanced loops simplify the way you create for loops. They are mostly used to iterate through an array or collection of variables.**

#### Creating another Class and adding it from main method

- Always create object in the main method it can be for other classes as well

- As we are using public classes

**Main.java**

```java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b;
        Student s1 = new Student();
        s1.name = "mian ruhanyat ";
        s1.Id = "011233018678";
        s1.cgpa = 5.00F;
        s1.display(s1.name,s1.Id,s1.cgpa);


    }
}
```

**Student.java**

```java
public class Student {
    String name;
    String Id;
    float cgpa;
    void display(String name,String Id,float cgpa){
        System.out.println("Name:"+name);
        System.out.println("Id:"+Id);
        System.out.println("cgpa:"+cgpa);
    }

}

```

##### Using user Input

**Main.java**

```java

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a, b;
        float c;

        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        s1.name = sc.nextLine();
        s1.Id= sc.nextLine();
        s1.cgpa = sc.nextFloat();



        s1.display(s1.name,s1.Id,s1.cgpa);


    }
}
```

**Student.java**

```java
public class Student {
    String name;
    String Id;
    float cgpa;
    void display(String name,String Id,float cgpa){
        System.out.println("Name:"+name);
        System.out.println("Id:"+Id);
        System.out.println("cgpa:"+cgpa);
    }
    public String toString(){
        return name +" "+cgpa;
    }
}

```

#### Constractor

- 1. We use the Constractor similar to the class name
- 2. But there will be no return type
- 3. I can create two same constractor with the different parameters.

#### Example

**Main.java**

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a, b;
        float c;

        Student s1 = new Student("mian al",3.45F);
        Scanner sc = new Scanner(System.in);
        s1.name = sc.nextLine();
        s1.Id= sc.nextLine();
        s1.cgpa = sc.nextFloat();



        s1.display(s1.name,s1.Id,s1.cgpa);


    }
}
```

**Student.java**

```java
public class Student {
    String name;
    String Id;
    float cgpa;
    Student(String name,float cgpa){
        this.name  = name;
        this.cgpa = cgpa;

    }

    void display(String name,String Id,float cgpa){
        System.out.println("Name:"+name);
        System.out.println("Id:"+Id);
        System.out.println("cgpa:"+cgpa);
    }
    public String toString(){
        return name +" "+cgpa;
    }
}


```

#### Problem-1

**Create a class named “Box” which has 3 attribute: length, width, height and a method named getVolume(). getVolume() method will calculate the volume of the Box and return the value.From “main” method create 2 Box objects with different length, width, height, then call the getVolume() method and print the volumes**

**Main.java**

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Box Vol = new Box();
        Scanner scan = new Scanner(System.in);
        Vol.length = scan.nextInt();
        Vol.width = scan.nextInt();
        Vol.height= scan.nextInt();
       int volumn= Vol.getVolumn(Vol.length, Vol.width, Vol.height);
        System.out.println(volumn);

    }
}
```

**Box.java**

```java
public class Box {
    public int length;
    public int width;
    public int height;

    public int getVolumn(int length,int width,int height){

        int VOL = length*width*height;
        return VOL;


    }
//    void display(int length,int width,int height){
//        System.out.println("Length:"+length);
//        System.out.println("Width:"+width);
//        System.out.println("Height:"+height);
//        System.out.println("Volumn is : "+VOl);
//
//    }
}

```

**output:**

```plaintext
45
65
78
228150
```