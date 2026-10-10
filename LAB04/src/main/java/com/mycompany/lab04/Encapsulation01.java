
package com.mycompany.lab04;

class Student {

    private int mark;

    public void setMarks(int mark) {
        this.mark = mark;
        System.out.println("Mark set to " + mark + "success");
    }

    public int getMark() {
        return mark;
    }

}

public class Encapsulation01 {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Setting marks");
        s1.setMarks(60);
        System.out.println("Marks = " + s1.getMark());
    }
}
