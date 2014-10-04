/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author Administrator
 */
public class DateAndTime extends Clock {
    private Date day = new Date();
    
    public Date getDate(){
        return day;
    }   
}
