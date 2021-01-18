package com.chetan.java;

interface Calculator{

    double operation();
}

class Add implements Calculator{
    int num1;
    int num2;
    Add(int a,int b){
        this.num1=a;
        this.num2=b;
        //operation();
    }

    @Override
    public double operation(){
        return num1+num2;
    }
}

class Multiply implements Calculator{
    int num1;
    int num2;

    Multiply(int a,int b){
        this.num1=a;
        this.num2=b;
       // operation();
    }
    @Override
    public double operation() {
        return num1*num2;
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        Calculator cal=new Add(43,54);
        Calculator cal1=new Multiply(43,54);
        double res=cal.operation();
        double res1=cal1.operation();
        System.out.println(res);
        System.out.println(res1);
    }
}
