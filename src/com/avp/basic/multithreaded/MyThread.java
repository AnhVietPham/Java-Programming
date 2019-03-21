package com.avp.basic.multithreaded;

public class MyThread implements Runnable {
    private String thrName;
    MyThread(String name){
        this.thrName = name;
    }
    @Override
    public void run() {
        System.out.println(thrName + " Starting");
        try{
            for (int count = 0; count < 10 ; count++){
                Thread.sleep(400);
                System.out.println("In " + thrName + ", count is " + count);
            }
        }catch (InterruptedException exc){
            System.out.println(thrName + " interrupted");
        }

        System.out.println(thrName + " terminating");
    }
}
