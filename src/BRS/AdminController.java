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
public class AdminController extends AdminModel {
    private AdminModel obj1=new AdminModel();
    
    
    public void clearSeatsCompletely(int z){
        obj1.clearSeatsCompletely(z);
    }
    public void resetTicketNumberSequence(int b){
        obj1.resetTicketNumberSequence(b);
    }
    public void BookingInquiry(String tick){
        obj1.BookingInquiry(tick);
    }
    public int getFound(){
        return obj1.getFound();
    }
    public String getRoute(){
        return obj1.getRoute();
    }
    public String getBusID(){
        return obj1.getBusID();
    }
    public String getSeatsID(){
        return obj1.getSeatsID();
    }
    public String getFare(){
        return obj1.getFare();
    }
    public String getDate(){
        return obj1.getDate();
    }
    public String getDepartTime(){
        return obj1.getDepartTime();
    }
    public String getName(){
        return obj1.getName();
    }
    public String getCnic(){
        return obj1.getCnic();
    }
    public String getPhone(){
        return obj1.getPhone();
    }
    public String getBookingDate(){
        return obj1.getBookingDate();
    }
    public String getBookingTime(){
        return obj1.getBookingTime();
    }
}
