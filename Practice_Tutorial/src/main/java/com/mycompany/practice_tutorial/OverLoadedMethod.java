package com.mycompany.practice_tutorial;

public class OverLoadedMethod {

    public static void main(String[] args) {
        System.out.println(add(2, 3));
        System.out.println(add(2, 3, 4));
        System.out.println(add(2, 3, 4, 5));

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
