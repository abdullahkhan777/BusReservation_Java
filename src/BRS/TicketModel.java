/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saqib Hussain
 */
public class TicketModel {
    private String name,phone,route,busId,date,time,seats,TicketNumber,seatIDs,Fare,cnic;
    private int bill;
    public void saveBookingTIme(){
        try {
            FileWriter fr1=new FileWriter("FareTemp.txt",true);
            PrintWriter pr1=new PrintWriter(fr1,true);
            TimeController tc=new TimeController();
            pr1.append("\r\n"+tc.getDateOnly()+"\r\n"+tc.getCurrentTime());
            pr1.close();
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    
    public void setTicketDataFromFile(){
        try {
            FileReader fr1=new FileReader("FareTemp.txt");
            BufferedReader br1=new BufferedReader(fr1);
            this.Fare=br1.readLine();
            this.seats=br1.readLine();
            this.date=br1.readLine();
            this.time=br1.readLine();
            br1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            FileReader fr2=new FileReader("PassengerTemp.txt");
            BufferedReader br2=new BufferedReader(fr2);
            this.name=br2.readLine();
            br2.readLine();
            br2.readLine();
            this.phone=br2.readLine();
            this.cnic=br2.readLine();
            this.busId=br2.readLine();
            this.route=br2.readLine();
            this.seatIDs=br2.readLine();
            br2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] x=this.Fare.split(" ");
        this.bill=Integer.parseInt(x[0])*Integer.parseInt(this.seats);
        
        
         
        try {
          int ticketN=0;
          String t;
          FileReader  fr3 = new FileReader("TicNumber.txt");
          BufferedReader br3=new BufferedReader(fr3);
          t=br3.readLine();
          ticketN=Integer.parseInt(t);
          
          br3.close();
          
          
          
         
          
          ticketN=ticketN+1;
          this.TicketNumber=String.valueOf(ticketN);
          this.ChangeTicketNumberInFile(this.TicketNumber);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    public void ChangeTicketNumberInFile(String tic){
        try {
            
            FileWriter fr1=new FileWriter("TicNumber.txt");
            PrintWriter pr=new PrintWriter(fr1);
            pr.write(tic);
            pr.close();
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void SaveNumberOfSeats(int x){
         try {
            FileWriter fr1=new FileWriter("FareTemp.txt",true);
            PrintWriter pr1=new PrintWriter(fr1,true);
            
            pr1.append("\r\n"+String.valueOf(x));
            pr1.close();
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }  
         

    }
    public String getName(){
        return this.name;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public String getCnic(){
        return this.cnic;
    }
    public String getRoute(){
        return this.route;
    }
    public String getFare(){
        return this.Fare;
    }
    public String getBusId(){
        return this.busId;
    }
    public String getSeatIDs(){
        return this.seatIDs;
    }
    public String getDate(){
        TimeController t1=new TimeController();
        return t1.getDateOnly();
    }
    public String getTime(){
        TimeController t1=new TimeController();
        return t1.getCurrentTime();
    }
    public String getBill(){
        return String.valueOf(this.bill);
    }
    public String getTicketNumber(){
        return this.TicketNumber;
    }
    public String getDepartureTime(){
        String depT="null";
        try {            
            FileReader fr1=new FileReader("DepartureTime.txt");
            BufferedReader br1=new BufferedReader(fr1);
            depT=br1.readLine();
            br1.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TicketModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return depT;
    }
    public String getNextDayDate(){
        String[] d;
        String date=this.getDate();
        d=date.split("-");
        int x=Integer.parseInt(d[0]);
        x=x+1;
        
        d[0]=String.valueOf("0"+x);
        String NewDate=d[0]+"-"+d[1]+"-"+d[2];
        
        return NewDate;
    }

    
}
