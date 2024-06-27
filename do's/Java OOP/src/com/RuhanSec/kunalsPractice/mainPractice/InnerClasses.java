package com.RuhanSec.kunalsPractice.mainPractice;

// Outer Classes of Inner Classes Can't be static
// Because its itself not depended  in a class
// but the inner class is depended on outside class


public class InnerClasses {
    // But inner classes can  be static

   static class Test {// here static means it can't be belong to the obj of InnerClasses
       // but it can be work with other obj of other classes

         String name;
        public Test(String name){
            this.name=name;
        }
        //overriding
       public String toString(){
           return name;
        }

        }

    public static void main(String[] args) {
            Test a = new Test("Ruhanyat");
            Test b = new Test("Tanvin");
        System.out.println(a);

    }
}
