package com.avp.basic.multithreaded.synchronizeddemo;

public class MyThread implements Runnable {
    Thread thread;
    static SumArray sumArray = new SumArray();
    int a[];
    int answer;

    MyThread(String name, int nums[]) {
        thread = new Thread(this, name);
        a = nums;
        thread.start();
    }

    @Override
    public void run() {
        int sum;
        System.out.println(thread.getName() + " starting");

        answer = sumArray.sumArray(a);

        System.out.println("Sum for " + thread.getName() + " is " + answer);

        System.out.println(thread.getName() + " terminating");
    }
}
