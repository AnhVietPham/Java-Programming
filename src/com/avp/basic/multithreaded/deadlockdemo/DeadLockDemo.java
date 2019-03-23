package com.avp.basic.multithreaded.deadlockdemo;

class DeadLockDemo {
    private final Object key1 = new Object();
    private final Object key2 = new Object();


    void methodOne(){
        synchronized (key1){
            System.out.println("In methodOne " + Thread.currentThread().getName());
            methodTwo();
        }
    }

    void methodTwo(){
        synchronized (key2){
            System.out.println("In methodTwo " + Thread.currentThread().getName());
            methodTree();
        }
    }

    private void methodTree(){
        synchronized (key1){
            System.out.println("In methodThree " + Thread.currentThread().getName());
        }
    }
}
