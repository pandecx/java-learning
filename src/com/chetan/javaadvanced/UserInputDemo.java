package com.chetan.javaadvanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) throws IOException {
        int n=0;
        int n1=0;
        String a=null;
        System.out.println("Enter a number: ");
        Scanner sc=null;
        try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in))){
            sc=new Scanner(System.in);
            n1=sc.nextInt();
            a=sc.toString();
            n=Integer.parseInt(br1.readLine());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        /*finally{
            br.close();
        }*/

        System.out.println("Number entered is :"+n);
        System.out.println("Number entered is :"+n1);
        System.out.println("String entered is :"+a);
    }
}
