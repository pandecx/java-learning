package com.chetan.java;

class Vehicle{
    void move(){
        System.out.println("Vehicle is moving");
    }
}

class Bike extends Vehicle{
    void changeGear(){
        System.out.println("Gear has changed");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("Car is running as it has four wheels");
    }

    @Override
    void move() {
        System.out.println("Moving in car class");
    }
}
public class HierarchialInherDemo {
    public static void main(String[] args){
        Bike b=new Bike();
        Car c=new Car();
        b.changeGear();
        c.run();
        c.move();
    }
}
