package com.chetan.java;

public class ArrayDeclare {
    public static void main(String[] args){
        int a[]=new int[5];
        int []b=new int[5];
        int c[]={1,12,11,15,14};
        int []d =new int[]{3,5,6,8,7};

        for (int i:c){
            System.out.println(i);
        }
    }
}
