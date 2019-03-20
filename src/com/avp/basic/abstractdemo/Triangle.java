package com.avp.basic.abstractdemo;

public class Triangle extends TwoDShape {
    private String style;

    public Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h, "Triangle");
        style = s;
    }

    Triangle(double x) {
        super(x, "Triangle");
        style = "Filled";
    }

    Triangle(Triangle ob) {
        super(ob);
        style = ob.style;
    }

    public void showStyle() {
        System.out.println("Triangle is " + style);
    }

    @Override
    double area() {
        return (getWidth() * getHeight()) / 2;
    }
}
