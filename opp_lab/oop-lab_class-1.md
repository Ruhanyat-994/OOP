# OOP Lab class 1

> **Online & Lab Performance > (n-1) will be counted.01**  
> **CT > (n-1) will be counted.**   
> **Assignment 2 will be counted and given as well.**

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

4. Function is called as Method in JAVA.
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

        for(int i=0;i<11;i++)
        {
            if(array[1]>array[i])
            {
                 System.out.println(array);

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
