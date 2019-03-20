package com.avp.basic.abstractdemo;

abstract class TwoDShape {
    private double width;
    private double height;
    private String name;

    TwoDShape(){
        width = height = 0.0;
        name = "none";
    }

    TwoDShape(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape(double x, String n){
        width = height = x;
        name = n;
    }

    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    public void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }

    abstract double area();

    double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
