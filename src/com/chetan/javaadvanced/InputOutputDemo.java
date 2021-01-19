package com.chetan.javaadvanced;

import java.io.*;
import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) throws FileNotFoundException{

        File empFileInfo=new File("C:\\Users\\chetan\\Documents\\GitHub\\java-learning\\resources\\Employee.txt");
        InputOutputDemo demo=new InputOutputDemo();
        demo.writeToFile(empFileInfo);

        File vehicleInfo=new File("C:\\Users\\chetan\\Documents\\GitHub\\java-learning\\resources\\Vehicle.txt");
        demo.readFile(vehicleInfo);

    }

    public void writeToFile(File file) {
        PrintWriter empWrite=null;
        try{
        empWrite = new PrintWriter(file);
        empWrite.println("Chetan");
        empWrite.println("100");
        }
        catch(FileNotFoundException e){
            //System.out.println(e.getMessage());
            System.out.println("File not found on loca disk "+file.getName());
            throw new RuntimeException(e);
        }
        finally {
            empWrite.close();
        }
    }

    public void readFile(File file) throws FileNotFoundException{
        Scanner input =new Scanner(file);
        while(input.hasNext()){
            System.out.println("Line ==>"+input.nextLine());
        }
    }
}
