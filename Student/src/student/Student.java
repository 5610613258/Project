/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Student {

    //field
    private int SIZE;
    public String firstname;
    public String lastname;
    public String faculty;
    public String major;
    public String university;
    public double[] gpa;

    //constructor
    public Student() {
        SIZE = 4;
        gpa = new double[SIZE];
    }
    // method
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        firstname = sc.next();
        System.out.print("Enter Last Name : ");
        lastname = sc.next();
        System.out.print("Enter University : ");
        university = sc.next();
        System.out.print("Enter Faculty : ");
        faculty = sc.next();
        System.out.print("Enter Major : ");
        major = sc.next();
        System.out.println("Enter GPA");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " year : ");
            gpa[i] = sc.nextDouble();
        }
    }

}
