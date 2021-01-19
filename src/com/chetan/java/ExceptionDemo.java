package com.chetan.java;

public class ExceptionDemo {
    public static void main(String[] args){
        int a=10;
        int b=0;
        int[] d={1,2,3,4,5};
        try{
            if (b==0){
                throw new RuntimeException("Divide by zero not possible");
            }
            double res=a/b;
            int e1=d[10];
            System.out.println("Divide result "+res);
            System.out.println("Array result : "+e1);
        }
        catch(ArithmeticException exception){
            System.out.println("Arithmetic Error Occured "+exception.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array Index error "+exc.getMessage());
        }/*
        catch(Exception e){
            System.out.println("Exception error!!");
        }*/
        finally {
            b+=1;
            double res=a/b;
            System.out.println("Final Code output: "+res);
        }
    }
}
