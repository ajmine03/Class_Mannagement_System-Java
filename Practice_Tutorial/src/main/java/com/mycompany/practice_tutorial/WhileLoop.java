
package com.mycompany.practice_tutorial;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";
        
        while(name.isEmpty()){
            System.out.print("Enter Your Name : ");
            name = scanner.nextLine();
        }
        
        System.out.print("Hello "+name);
        
        scanner.close();
        
    }
}
