# LAB-CLASS-3

### 2D Array

**Manually**
```java

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] num = new int[5][3];

        int[][] num1 = {
                {3,4,5},
                {3,4,5},
                {3,4,5},
                {3,4,5},
                {3,4,6}
        };

        for(int i=0;i<5;i++){

            System.out.println(Arrays.deepToString(num1));

        }



    }
}
```
- If you use nested for loop then you can't use the deepToString method
- Outer for loop is for row and inner loop for column

#### Taking Array input 
```java
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int[][] num = new int[5][3];

        int[][] num1 = new int[3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                num1[i][j] = scanf.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(num1));
        System.out.println("Array Size"+" "+num1.length);
    }
}
```
**Output**
```sh
[[5, 5, 5], [5, 5, 5], [5, 5, 5]]
Array Size 3
```

#### Taking row and column as input and also the array elements
```java
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Please Enter The row:");
        int row= scanf.nextInt();
        System.out.print("Please Enter The col:");
        int col=scanf.nextInt();

        int[][] num1 = new int[row][col];
        int sum = 0;

        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){

                System.out.print("Enter row "+" "+(i+1)+"And Column"+" "+(j+1)+" :");

                num1[i][j] = scanf.nextInt();
                sum = sum + num1[i][j];

            }
        }
        System.out.println(Arrays.deepToString(num1));
        System.out.println("Array Size"+" "+num1.length);
        System.out.println(sum);



    }
}
```
**Output**
```sh
Please Enter The row:2
Please Enter The col:2
Enter row  0 And Column 0 :5
Enter row  0 And Column 1 :4
Enter row  1 And Column 0 :4
Enter row  1 And Column 1 :5
[[5, 4], [4, 5]]
Array Size 2
18
```
#### Find ROW sum and Column Sum
##### **Row Sum**
```java
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("Please Enter the Row number: ");
        Scanner scanf = new Scanner(System.in);
        int rowNumber = scanf.nextInt();
        System.out.print("Please Enter the Column number: ");
        int colNumber = scanf.nextInt();

        int[][] array = new int[rowNumber][colNumber];

        int sum = 0;

        for(int i =0;i<rowNumber;i++)
        {
            sum = 0;
            for (int j =0;j<colNumber;j++)
            {
                System.out.print("Enter row "+" "+(i+1)+" And Column"+" "+(j+1)+" :");
                array[i][j]= scanf.nextInt();
                sum+= array[i][j];
            }
            System.out.println(Arrays.deepToString(array));
            System.out.println("The Sum of Row "+i+" is "+sum);
        }
    }
}
```

#### Find Maximum Value for every row and column
```java
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.print("Please Enter The row:");
        int row= scanf.nextInt();
        System.out.print("Please Enter The col:");
        int col=scanf.nextInt();
        int[][] num1 = new int[row][col];
        int sum = 0;
        int max = 0;

        for(int i =0;i<row;i++){
            int Max = 0;
            for(int j=0;j<col;i++){
                if(Max < num1[i][j])
                {
                    Max = num1[i][j];
                }
            }
            System.out.println(Max);
        }
    }
}

```

#### Row fixed but column size different

#### Constractor question 3

**Main.java**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner customerInput = new Scanner(System.in);

        BankAccount bank = new BankAccount("Mian Al Ruhanyat","hello@gmail.com",324234.23423,"654687");
        



    }
}
```
**BankAccount.java**
```java
public class BankAccount {
    String name ;
    String email;
    double balance ;
    String accNumber;
    BankAccount(String name,String email , double balance, String accNumber){
        this.name = name;
        this.email = email;
        this.balance = balance;
        this.accNumber= accNumber;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Account Number: "+accNumber);
        System.out.println("Balance: "+balance);
    }
}
```