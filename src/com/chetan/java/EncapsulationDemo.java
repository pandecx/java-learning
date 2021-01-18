package com.chetan.java;

// In encapsulation we set variable as private and use getter setter public method to use that variable

class Employees{
    private String name;
    public String getNAme(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args){
        Employees e1=new Employees();
        e1.setName("Chetan");
        System.out.println(e1.getNAme());
    }
}
