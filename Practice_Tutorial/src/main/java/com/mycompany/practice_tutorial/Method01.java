package com.mycompany.practice_tutorial;

public class Method01 {

    public static void main(String[] args) {
        call();
        String name = "ajmine";
        int age = 24;
//        parameter(name);
        parameter(name,age);

    }

    static void call() {
        System.out.println("call function is called ");
    }
     static void parameter(String name,int age) {
        System.out.println(name+" "+age);
    }
     

}
