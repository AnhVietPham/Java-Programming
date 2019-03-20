package com.avp.basic.abstractdemo;

public class Rectangle extends TwoDShape {

    public Rectangle() {
        super();
    }

    Rectangle(double w, double h) {
        super(w, h, "Rectangle");
    }

    Rectangle(double x) {
        super(x, "Rectangle");
    }

    public Rectangle(Rectangle ob) {
        super(ob);
    }

    public boolean isSquare() {
        return getHeight() == getWidth();

    }

    @Override
    double area() {
        return getWidth() * getHeight();
    }

}
