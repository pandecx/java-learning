package com.chetan.javaadvanced;

class Counter{
    int count;
    public synchronized int increment(){ // to make method thread safe , i.e. one thread can access it at a time
        return count++;
    }
}
public class ThreadSyncDemo {
    public static void main(String[] args) throws Exception{
        Counter c=new Counter();
        Thread t1=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i=1;i<=10000000;i++){
                            c.increment();
                        }
                    }
                }
        );


        Thread t2=new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for (int i=1;i<=10000000;i++){
                            c.increment();
                        }
                    }
                }
        );

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        int res=c.increment();
        System.out.println(res);
        }
}
