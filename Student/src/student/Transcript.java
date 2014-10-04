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
public class Transcript {

    // field
    private final int SIZE = 4;
    private final String firstname;
    private final String lastname;
    private final String faculty;
    private final String major;
    private final String university;
    private final double[] gpa = new double[SIZE];
    private double sum;

    //constructor
    public Transcript(Student s) {
        this.firstname = s.firstname;
        this.lastname = s.lastname;
        this.university = s.university;
        this.faculty = s.faculty;
        this.major = s.major;
        System.arraycopy(s.gpa, 0, this.gpa, 0, SIZE);

    }

    public double sumGPA() {
        for (int i = 0; i < SIZE; i++) {
            sum += gpa[i];
        }
        sum /= SIZE;
        return sum;
    }

    public double getSum() {
        return sum;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getSIZE() {
        return SIZE;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getMajor() {
        return major;
    }

    public String getUniversity() {
        return university;
    }

    public void printGpa() {
        for(int i = 0;i < SIZE; i++){
            System.out.print("GPA " + i+1);
            System.out.printf(" year : %.2f", gpa[i]);
            System.out.println("");
        }
    }


}
