
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Input {
    // field
    private int startdate;
    private int enddate;
    private int amountdate;
    // constructor
    public Input(){
        startdate = 0;
        enddate = 0;
        amountdate = 0;
    }
    public Input(int startdate, int enddate){
        this.startdate = startdate;
        this.enddate = enddate;
    }
    /* method */
    // Calculate amountdate
    public void calAmountDate(){
        this.amountdate = (enddate - startdate) + 1 ;
    }
    // Input date
    public void Scan(){
        Scanner sc = new Scanner(System.in);
        this.startdate = sc.nextInt();
        this.enddate = sc.nextInt();
        this.calAmountDate();
    }
    
    public int getAmountdate() {
        return amountdate;
    }
    
}
