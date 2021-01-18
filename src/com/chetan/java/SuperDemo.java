package com.chetan.java;

class VehicleMove{
    VehicleMove(){
        System.out.println("Vehicle move because it has wheels");
    }
}
class Trucks extends VehicleMove{
    Trucks(){
        System.out.println("Trucks has 4 wheels");
    }
}

public class SuperDemo {
    public static void main(String[] args){
        Trucks t=new Trucks();
    }
}
