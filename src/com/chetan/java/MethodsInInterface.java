package com.chetan.java;

interface IntMethods{
    default void say(){
        System.out.println("Default Method Implementation");
        //sayHello();
    }
    /*private void sayHello(){
        System.out.println("Private Method Implementation");
    }*/
}

public class MethodsInInterface implements IntMethods {
    public static void main(String[] args){
        IntMethods m=new MethodsInInterface();
        m.say();
    }
}
