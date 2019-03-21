package com.avp.basic.multithreaded;

public class MainMultithreadedDemo {
    public static void main(String[] args){
        System.out.println("Main thread starting");

        MyThread myThread = new MyThread("Child #1");

        Thread newThread = new Thread(myThread);

        newThread.start();

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread ending");
    }
}
