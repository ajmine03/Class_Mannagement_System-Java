package com.mycompany.practice_tutorial;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        for (int i = 0; i < 11; i++) {
            System.out.println("Your name is : " + name + " " + i);
        }
        scanner.close();
    }
}
