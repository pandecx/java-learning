package com.chetan.java;

class Man{
    void pay(){
        System.out.println("Man is paying bill");
    }
}

class Millionare extends Man{
    void pay(){
        System.out.println("Manager is paying bill and tiping also");
    }
}

public class MethodOverRideDemo {
    public static void main(String[] args){
        Man m=new Millionare();
        m.pay(); //Method Overrided
        /* Man m1=new Man();
        m1.pay();
        Millionare m2=new Millionare();
        m2.pay();
        */
    }
}
