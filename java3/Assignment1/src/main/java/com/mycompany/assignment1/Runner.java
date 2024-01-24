/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;

/**
 *
 * @author raksh
 */
public class Runner extends Student {
    public static void main(String[] args) {
        Student obj1 =new Student(202109997,"Harneet","Kaur",3.6);
        Student obj2 =new Student(202200740,"Deepak","Shamra",3.5);
        System.out.println("INFORMATION FOR STUDENT 1");
        System.out.println("Student ID: "+ obj1.getStudent_id());
        System.out.println("GRADE: "+obj1.getCGPA());
        System.out.println("FIRST NAME: " +obj1.getFirst_name());
        System.out.println("LAST NAME: " +obj1.getLast_name());
        System.out.println("FULL NAME"+obj1.getName());
        System.out.println("------------------------------");
         System.out.println("INFORMATION FOR STUDENT 2");
        System.out.println("Student ID: "+ obj2.getStudent_id());
        System.out.println("GRADE: "+obj2.getCGPA());
        System.out.println("FIRST NAME: " +obj2.getFirst_name());
        System.out.println("LAST NAME: " +obj2.getLast_name());
        System.out.println("FULL NAME"+obj2.getName());
        
    }
}
