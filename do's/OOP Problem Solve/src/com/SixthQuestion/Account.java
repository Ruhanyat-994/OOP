package com.SixthQuestion;

public class Account {
     int acc_no ;
     double balance;

    Account(int acc_no,double balance)
    {
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public  void disp(){
        System.out.println("Account No: "+acc_no);
        System.out.println("Balance: "+ balance);
    }


}
class Person extends Account{
    String name;
    String nidNum;
    Person(int acc_no,double balance,String name,String nidNum)
    {
        super(acc_no,balance);
        this.name= name;
        this.nidNum= nidNum;

    }
    @Override
    public void disp(){
        super.disp();
        System.out.println("Name: "+name);
        System.out.println("Nid: "+nidNum);
    }
}


