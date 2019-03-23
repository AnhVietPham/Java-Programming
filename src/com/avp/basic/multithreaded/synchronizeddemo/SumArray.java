package com.avp.basic.multithreaded.synchronizeddemo;

class SumArray {
    private int sum;

    synchronized int sumArray(int num[]){
        sum = 0;

        for (int i1 : num) {
            sum += i1;
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        return sum;
    }
}
