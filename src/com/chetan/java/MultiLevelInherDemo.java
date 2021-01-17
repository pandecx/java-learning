package com.chetan.java;

class VehicleMulti{
    int numberOfWheels=4;
    String brand="BMW";
    void manufacturer(int n,String brand){
        this.numberOfWheels=n;
        this.brand=brand;
        System.out.println("Manufacturer for brand "+this.brand+" is India having number of wheels as "+this.numberOfWheels);
    }
}

class CarMulti extends VehicleMulti{
    void getManufacturer(String brand){
        this.brand=brand;
        numberOfWheels=40;
        manufacturer(numberOfWheels,this.brand);
    }
}

class SuperCar extends CarMulti{

    @Override
    void getManufacturer(String brand) {
        numberOfWheels=30;
        this.brand=brand;
        manufacturer(numberOfWheels,this.brand);
    }

}
public class MultiLevelInherDemo {

    public static void main(String[] args){
        SuperCar spc=new SuperCar();
        spc.getManufacturer("Mercedes");
    }
}
