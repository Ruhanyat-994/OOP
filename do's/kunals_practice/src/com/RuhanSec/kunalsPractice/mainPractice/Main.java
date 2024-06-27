package com.RuhanSec.kunalsPractice.mainPractice;
// we don't need to import the package of Human because its in the dame package!
// If we use human into another packages main we would import it there

public class Main {
    public static void main(String[] args) {
        Human Ruhanyat = new Human(32,"Mian Al Ruhanyat",150000,false);
        Human Tanvin = new Human(32,"Ibn tan hasan",150000,false);
        Human Mehedi = new Human(32,"Mehedi hasan priom",150000,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        // Static variable don't depend on object
       // greeting();
        Main fun2 = new Main();
        fun2.fun() ;

    }
    // we can't access a nonstatic method from a static method
    // because a nonstatic method belongs to an object
     void greeting(){
         System.out.println("Good Morning");

    }
    void fun(){
        greeting();
    }
}
