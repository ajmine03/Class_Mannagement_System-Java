package com.mycompany.lab04;

public class StudentGpaMannagementSystem {

    private String name;
    private double cgpa;
    public static int count = 0;
    public static double totalcg = 0;

    public StudentGpaMannagementSystem(String n, double b) {
        this.name = n;
        this.cgpa = b;
        count++;
        totalcg = totalcg + b;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCgpa(int a) {
        this.cgpa = a;

    }

    public static int totalCalc() {
        return count;
    }

    public static void main(String[] args) {
        StudentGpaMannagementSystem s1 = new StudentGpaMannagementSystem("Alice", 3.0);
        StudentGpaMannagementSystem s2 = new StudentGpaMannagementSystem("Bob", 3.0);
        StudentGpaMannagementSystem s3 = new StudentGpaMannagementSystem("Charlie", 3.00);

        System.out.println("Name: " + s1.name + "      |  " + s1.cgpa);
        System.out.println("Name: " + s2.name + "        |  " + s2.cgpa);
        System.out.println("Name: " + s3.name + "    |  " + s3.cgpa);
        System.out.println("_____________________________");
        System.out.println("Total Cgpa : "+ count);
        System.out.printf("Average CGPA: %f", totalcg/count);

    }

}
