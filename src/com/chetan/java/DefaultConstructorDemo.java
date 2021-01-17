package com.chetan.java;

class Student{
    int rollNo;
    String name;

    void display(){
        System.out.println("Roll Number : "+rollNo+"\nStudent Name : "+name);
    }
}
public class DefaultConstructorDemo {

    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
    }

}
