package com.chetan.java;

public class VariableTypes {
    Integer instanceVariable=30;
    static Integer staticVariable=40;

    public void TestVariable(){
        VariableTypes obj1=new VariableTypes();
        obj1.instanceVariable=10;
        System.out.println("Instance Variable in obj1 is "+obj1.instanceVariable);
        VariableTypes obj2=new VariableTypes();
        obj2.instanceVariable=20;
        System.out.println("Instance Variable in obj2 is "+obj2.instanceVariable);
        instanceVariable=60;
        staticVariable=50;
        System.out.println("Instance Variable in class A is "+instanceVariable);
        System.out.println("Static Variable in class A is "+staticVariable);
    }

    public static void main(String[] args){
        VariableTypes obj=new VariableTypes();
        obj.TestVariable();
        System.out.println("Static Main "+staticVariable);

        System.out.println("Instance Main "+obj.instanceVariable);
    }

}
