package com.SixthQuestion;

public class Main {

    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0]= new Person(101,5000.52,"Mian","45fgdfg9874");
        people[1]= new Person(1071,156.52,"jubaer","64165461");
        people[2]= new Person(11,509847.52,"Mian","45fgdfg9874");
        people[3]= new Person(1041,50050.52,"nazi","468465");
        people[4]= new Person(101,5000.52,"Mian","45fgdfg9874");

        for(Person person: people)
        {
            person.disp();

            System.out.println("---------------------------");
        }


    }
}
