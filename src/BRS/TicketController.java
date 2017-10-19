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
public class TicketController {
    TicketModel obj1=new TicketModel();
    
    public void saveBookingTIme(){
        obj1.saveBookingTIme();
    }
    public void SaveNumberOfSeats(int x){
        obj1.SaveNumberOfSeats(x);
    }
    public void setTicketDataFromFile(){
        obj1.setTicketDataFromFile();
    }
    
    public String getName(){
        return obj1.getName();
    }
     public String getNextDayDate(){
         return obj1.getNextDayDate();
     }
    public String getPhone(){
        return obj1.getPhone();
    }
    public String getCnic(){
        return obj1.getCnic();
    }
    public String getRoute(){
        return obj1.getRoute();
    }
    public String getFare(){
        return obj1.getFare();
    }
    public String getBusId(){
        return obj1.getBusId();
    }
    public String getSeatIDs(){
        return obj1.getSeatIDs();
    }
    public String getDate(){
        return obj1.getDate();
    }
    public String getTime(){
        
        return obj1.getTime();
    }
    public String getBill(){
        return obj1.getBill();
    }
    public String getTicketNumber(){
        return obj1.getTicketNumber();
    }
    public String getDepartureTime(){
        return obj1.getDepartureTime();
    }
    public String getAdminCode(){
        AdminController ad1=new AdminController();
        return ad1.getsecretCode();
    }
}
