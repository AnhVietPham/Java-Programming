package com.avp.basic.multithreaded.synchronizeddemo;
/*
* Once a synchronized method has been called, the object is locked and no synchronized
* methods on the same object can be used by another thread of execution
* Other threads trying to call an in-use synchronized object will enter a wait state until
* the object is unlocked.
* */
public class MainSync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread myThread1 = new MyThread("Child #1", a);
        MyThread myThread2 = new MyThread("Child #2", a);

        try {
            myThread1.thread.join();
            myThread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
    }
}
