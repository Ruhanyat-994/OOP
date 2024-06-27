package com.RuhanSec.kunalsPractice.mainPractice;
// Initialization of static variable

public class StaticExample {

    static int a =4;
    static int b;

    static {
        // it only runs once when the first object is created
        System.out.println("This is first time loaded");
        b = a*5;

    }

    public static void main(String[] args) {
        StaticExample obj = new StaticExample();
        System.out.println(StaticExample.a+" "+StaticExample.b);
    }
}
