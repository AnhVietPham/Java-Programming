package com.avp.basic;

import com.avp.basic.instanceofdemo.Car;
import com.avp.basic.instanceofdemo.Toyota;
import com.avp.basic.instanceofdemo.Van;
import com.avp.basic.instanceofdemo.Vehicle;

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

        Vehicle v = new Vehicle();
        Car c = new Car();
        Van van = new Van();
        Toyota to = new Toyota();

        System.out.println(c instanceof Vehicle);
        System.out.println(van instanceof Vehicle);
        System.out.println(to instanceof Vehicle);
        System.out.println(c instanceof Toyota);
    }
}
