package student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class TestStudent {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student();
        s.Input();
        Transcript t = new Transcript(s);
        t.sumGPA();
        Company c = new Company();
        c.acceptApplication(t);
    }
}
