/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package student;

/**
 *
 * @author Administrator
 */
public class Company {
    
    public void acceptApplication(Transcript t){

        System.out.println("Frist Name : " + t.getFirstname());
        System.out.println("Last Name : " + t.getLastname());
        System.out.println("University : " + t.getUniversity());
        System.out.println("Faculty : " + t.getFaculty());
        System.out.println("Major : " + t.getMajor());
        t.printGpa();
        System.out.printf("GPA average : %.2f", t.getSum());

        
    }
}
