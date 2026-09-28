
package com.mycompany.lab03;

public class Lab03_1 {
     
    String room;
    int totalStudent;
    Student s1 = new Student();
 
 
   void sectionInfo(){
       
             totalStudent = 50;
             room = "501(A)";
             
      System.out.println("Total: " + totalStudent);
      System.out.println("id: " + room);
      s1.displayInfo();
   }
}