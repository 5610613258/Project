/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Clock {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a z");
        Date date = new Date();
        String formattedDateTime = dateFormat.format(date);
        System.out.println(formattedDateTime);
    }
}
