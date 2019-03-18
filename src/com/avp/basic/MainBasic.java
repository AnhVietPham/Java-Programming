package com.avp.basic;

public class MainBasic {
    public static void main(String[] args) {
        Calculation cal = new Calculation();
        cal.addition(5, 6);
        /*
         * cal.multiplication(5,5);
         * Super class cannot access method or attributes of subclass
         * But subclass can be created by superclass
         * Calculation cal = new Calculation();
         * Calculation mycal = new MyCalculation();
         * */


        /*
        * Sub class can access method or attributes of super class
        * */
        MyCalculation myCalculation = new MyCalculation();
        myCalculation.multiplication(6, 8);

        cal = new MyCalculation();
        ((MyCalculation) cal).multiplication(1,3);

    }
}
