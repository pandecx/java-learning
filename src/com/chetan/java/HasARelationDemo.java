package com.chetan.java;

/*Loosely coupled Class Name , which is used as property in EmployeeInfo Class */

class Name{
    String firstName;
    String lastName;
    public Name(String first,String last){
        this.firstName=first;
        this.lastName=last;
    }
}

class EmployeeInfo{
    int id;
    Name name;

    EmployeeInfo(int id,Name name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("Employee ID is "+id);
        System.out.println("Employee first name is "+name.firstName+" and last name is "+name.lastName);
    }
}

public class HasARelationDemo {

    public static void main(String[] args){
        Name nm=new Name("Chetan","Pandey");
        EmployeeInfo emp=new EmployeeInfo(1, nm);
        emp.display();
    }
}
