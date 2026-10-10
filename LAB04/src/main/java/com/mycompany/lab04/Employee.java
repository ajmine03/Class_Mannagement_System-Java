
package com.mycompany.lab04;

public class Employee {

    private String name;
    private int id;
    private double salary;

    public Employee(String name, int a, double b) {
        this.name = name;
        this.id = a;
        this.salary = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int a) {
        this.id = a;
    }

    public void setSalary(double b) {
        this.salary = b;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahim", 101, 25000.0);

        System.out.println("Name: " + e1.name);
        System.out.println("ID: " + e1.id);
        System.out.println("Salary: " + e1.salary);
    }
}
