package com.firstQuestion;

public class Student {

    public String name;

    public Student(){
        this.name = "Unknown";
    }
    public Student(String name)
    {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {

        Student student_1 = new Student();
        Student student_2 = new Student("Mian Al Ruhanyat");

        System.out.println("Student_1 is : "+student_1.getName());
        System.out.println("Student_2 is : "+student_2.getName());



    }
}
