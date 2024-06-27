package com.RuhanSec.kunalsPractice.SingleTon;

public class SingleTon {
    // a class that can create only one object
    // you should not allow anyone to call the constractor of that class
    // whenever you call a constractor it will create a new obj


    private SingleTon(){

    }
    private static SingleTon instance;

    public static SingleTon getInstance(){
        if(instance==null)
        {
            instance = new SingleTon(); // we are not writing SingleTon before the
            //instance because we are in the same file of SingleTon

        }
        return instance;

        }

    }

}
