package com.chetan.java;

abstract class Shape{
    abstract double area(int side);
}

class Circle extends Shape{
    @Override
    double area(int r) {
        return 3.14*r*r;

    }
}
public class AbstractDemo {
    public static void main(String[] args){
        Shape c=new Circle();
        double area_circle=c.area(65);
        System.out.println("Area is : "+area_circle);
    }
}
