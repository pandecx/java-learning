package com.chetan.java;

class Employee extends Manager {
    int id=1;

    //String name;25000;

}
public class InheritanceDemo {
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.salary=1000;
        Manager mng=new Manager();
        mng.salary=20000;
        System.out.println("Employee with id "+emp.id+" gets salary of "+emp.salary);
        System.out.println("Manager salary is "+mng.salary);
    }
}
