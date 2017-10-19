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
public class TimeController {
    String Date;
    
    TimeModel obj1=new TimeModel();
    public String getDateOnly(){
        
        this.Date=obj1.getDate();
        return this.Date;
    }
    public String getCurrentTime(){
        return obj1.getCurrentTime();
    }
    public void ResetEveryThingOnDateChange(){
        obj1.ResetEveryThingOnDateChange();
    }
}
