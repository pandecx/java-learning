package com.chetan.javaadvanced;

class Hi extends Thread{ // Class Hi is now a thread , which will be called via object
    public void run(){
        for(int i=0;i<=5;i++) {
            System.out.println("Hi");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}

class Hello extends Thread{

    public void run(){ //Start() will call run automatically
        for(int i=0;i<=5;i++) {
            System.out.println("Hello");
            try{Thread.sleep(500);}catch(Exception e){}
        }
    }
}
public class MultiThreadDemo {
    public static void main(String[] args){
        Hi obj1=new Hi();
        Hello obj2=new Hello();

        obj1.start();
        try{Thread.sleep(10);}catch (Exception e){} //To execute secodn thread after first one
        obj2.start();
        //obj1.run();
        //obj2.run();
    }

}
