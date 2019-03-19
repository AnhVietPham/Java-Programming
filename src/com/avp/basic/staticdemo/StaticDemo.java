package com.avp.basic.staticdemo;

/*
* Non-static variable cannot be referenced from a static context
* Link: https://stackoverflow.com/questions/2559527/non-static-variable-cannot-be-referenced-from-a-static-context
* The static variable is shared all objects of class
* */
public class StaticDemo {
    int x;
    static int y;

    int sum() {
        return x + y;
    }

    public static void main(String[] args){
        StaticDemo staticDemo1 = new StaticDemo();
        StaticDemo staticDemo2 = new StaticDemo();

        staticDemo1.x = 10;
        staticDemo2.x = 20;

        System.out.println("Independent : staticDemo1.x :" + staticDemo1.x + " , staticDemo2.x :" + staticDemo2.x);
        System.out.println();

        StaticDemo.y = 10;
        System.out.println("staticDemo1.sum(): " + staticDemo1.sum());
        System.out.println("staticDemo2.sum(): " + staticDemo2.sum());

        StaticDemo.y = 100;
        System.out.println("Change StaticDemo.y to 100");
        System.out.println("staticDemo1.sum(): " + staticDemo1.sum());
        System.out.println("staticDemo2.sum(): " + staticDemo2.sum());
    }
}
