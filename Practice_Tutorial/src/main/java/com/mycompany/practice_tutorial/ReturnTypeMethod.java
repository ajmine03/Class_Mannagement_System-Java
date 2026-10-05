package com.mycompany.practice_tutorial;

public class ReturnTypeMethod{

    public static void main(String[] args) {
        double num = 13;
        double x = square(num);
        retrn(x);

    }

    static double square(double num) {
        return num * num;
    }

    static void retrn(double n) {
        System.out.println("The squere is " + n);
    }
}


