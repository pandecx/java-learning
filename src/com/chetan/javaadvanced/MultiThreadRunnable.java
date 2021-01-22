package com.chetan.javaadvanced;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class MultiThreadRunnable {
    public static void main(String[] args) throws Exception {

        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=5;i++) {
                    System.out.println("Hi");
                    try{Thread.sleep(500);}catch(Exception e){}
                }
            }
        };
        //Via Lambda Expression
        Runnable obj2 = ()-> {
            for(int i=0;i<=5;i++) {
                System.out.println("Hello");
                try{Thread.sleep(500);}catch(Exception e){}
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3=new Thread(()-> {
            for(int i=0;i<=5;i++) {
                System.out.println("Not Runnable Object");
                try{Thread.sleep(500);}catch(Exception e){}
            }
        });
        t1.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        } //To execute second thread after first one
        t2.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Bye..!!");
    }
}
