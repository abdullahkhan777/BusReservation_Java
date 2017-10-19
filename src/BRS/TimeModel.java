/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

/**
 *
 * @author Saqib Hussain
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class TimeModel {
    String Date,Time;
    Timestamp  t1=new Timestamp(System.currentTimeMillis());
    public String getDate(){
        
      DateFormat df1=new SimpleDateFormat("dd-MM-yyyy");
      Date=df1.format(t1);
      return Date;
      
    }
    public String getCurrentTime(){
      DateFormat df1=new SimpleDateFormat("hh:mm");
      Date=df1.format(t1);
      return Date;
    }
   
    public void ResetEveryThingOnDateChange(){
        String Date="null";
        try {
            
            FileReader fr1 = new FileReader("Date.txt");
            BufferedReader br1=new BufferedReader(fr1);
            Date=br1.readLine();
            br1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TimeModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TimeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        AdminController ac1=new AdminController();
        if(!Date.equals(this.getDate())){
            ac1.clearSeatsCompletely(0);
 
            
        }
        else{
            
        }
        
        try {
            FileWriter fw1=new FileWriter("Date.txt");
            PrintWriter pw1=new PrintWriter(fw1);
            pw1.write(this.getDate());
            pw1.close();
        } catch (IOException ex) {
            Logger.getLogger(TimeModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
