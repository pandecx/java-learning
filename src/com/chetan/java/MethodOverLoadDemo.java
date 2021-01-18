package com.chetan.java;

class Area{
    public int area(int b,int l){
        return b*l;
    }
    public double area(int r){
        return (3.14*r*r) ;
    }
}

public class MethodOverLoadDemo {
    public static void main(String[] args){
        Area a=new Area();
        int area_of_rect=a.area(50,60);
        double area_of_circle=a.area(25);
        System.out.println("Area of Rectangle is "+area_of_rect);
        System.out.println("Area of Circle is "+area_of_circle);
    }

}
