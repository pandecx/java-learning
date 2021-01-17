package com.chetan.java;

public class HelloWorld {

    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        HelloWorld objAdd=new HelloWorld();
        System.out.println("Hello World");
        System.out.println(objAdd.add(5,7));

    }
}
