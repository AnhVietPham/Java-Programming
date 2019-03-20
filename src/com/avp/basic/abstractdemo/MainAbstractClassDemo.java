package com.avp.basic.abstractdemo;

/*
* You want to create a superclass that defines only a generalized form that
* will be shared by all of its subclass, leaving it to each subclass to fill in the
* details.
* */
public class MainAbstractClassDemo {

    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];

        TwoDShape twoDShape = new TwoDShape() {
            @Override
            double area() {
                return 0;
            }
        };

        System.out.println("Object is " + twoDShape.getName());
        System.out.println("Area is " + twoDShape.area());

        shapes[0] = new Triangle("Outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);

        for (TwoDShape shape : shapes) {
            System.out.println("Object is " + shape.getName());
            System.out.println("Area is " + shape.area());
            System.out.println();
        }
    }
}
