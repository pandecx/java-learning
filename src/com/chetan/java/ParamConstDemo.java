package com.chetan.java;

class Students{
    int rollNo;
    String name;
    static String country="Not defined";

    static void check(){
        country="India";
    }

    Students(){
        this(1,"Chetan");
        System.out.println("Roll Number : "+rollNo+"\nStudent Name : "+name+"\nCountry : "+country);
    }

    Students(int i,String a){
        this(i,a,country);
    }

    Students(int i,String a,String b){
        this.rollNo=i;
        this.name=a;
        this.country=b;
        System.out.println("Hello "+this.name);
    }

}
public class ParamConstDemo {

    public static void main(String[] args) {
        Students.check();
        Students obj = new Students();
    }

}
