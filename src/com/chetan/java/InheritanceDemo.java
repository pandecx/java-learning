package com.chetan.java;

class Manager{
    int salary=100000;
}

class Employee extends Manager{
    int id=1;
    //String name;
    int empSal=25000;

}
public class InheritanceDemo {
    public static void main(String[] args){
        Employee emp=new Employee();
        System.out.println("Employee with id "+emp.id+" gets salary of "+emp.empSal);
        System.out.println("Manager salary is "+emp.salary);
    }
}
