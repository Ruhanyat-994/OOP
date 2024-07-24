package com.piash;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "piash";
        student.rollNo  = 2;
        student.number = 99.5f;

        System.out.println(student.name);
        System.out.println(student.rollNo);
        System.out.println(student.number);

    }
}

class Student {
    String name;
    int rollNo;
    float number;

}
