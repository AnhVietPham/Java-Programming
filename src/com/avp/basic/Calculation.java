package com.avp.basic;

class Calculation {
    int result;

    public void addition(int numberOne, int numberTwo){
        result = numberOne + numberTwo;
        System.out.println("The sum:" + result);
    }

    public void subtraction(int numberOne, int numberTwo){
        result = numberOne - numberTwo;
        System.out.println("The subtraction:" + result);
    }
}
