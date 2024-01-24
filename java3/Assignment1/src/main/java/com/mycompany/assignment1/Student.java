/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1;

/**
 *
 * @author raksh
 */
public class Student {
    private int Student_id;
    private String First_name;
    private String Last_name;
    private double CGPA;
    public Student(){}
    public Student(int Student_id,String First_name, String Last_name,double CGPA){
        Student_id=this.Student_id;
        First_name=this.First_name;
        Last_name=this.Last_name;
        CGPA=this.CGPA;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * @return the Student_id
     */
    public int getStudent_id() {
        return Student_id;
    }

    /**
     * @return the First_name
     */
    public String getFirst_name() {
        return First_name;
    }

    /**
     * @return the Last_name
     */
    public String getLast_name() {
        return Last_name;
    }

    /**
     * @return the CGPA
     */
    public double getCGPA() {
        return CGPA;
    }
    public String getName(){
        String name="name";
        if(First_name!=null){
            name=First_name.concat(Last_name);
        }
        return "name is" + name;
    }
}
