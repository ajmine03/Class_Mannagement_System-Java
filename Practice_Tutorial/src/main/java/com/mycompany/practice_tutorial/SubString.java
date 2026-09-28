package com.mycompany.practice_tutorial;

import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Email : ");

        String email;
        String username;
        String domain;

        email = scanner.nextLine();
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);

    }

}
