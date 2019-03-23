package com.avp.basic.multithreaded.deadlockdemo;

/*
* A deadlock is a situation where minimum two threads are holding the lock on some different resource,
* and both are waiting for other’s resource to complete its task.
* */
public class MainDeadLock {
    public static void main(String args[]){
        DeadLockDemo deadLockDemo = new DeadLockDemo();

        Runnable r1 = deadLockDemo::methodOne;

        Runnable r2 = deadLockDemo::methodTwo;

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
