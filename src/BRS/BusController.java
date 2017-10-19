/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saqib Hussain
 */
public class BusController{
    private static boolean[] ck=new boolean[42];
    private static boolean status[]=new boolean[42];
    
    private String Route;
    private String busId;
    private boolean Ac;
    private double Fare;
    private String DepartureTime,ArrivalTime;
    BusModel Obj1=new BusModel();
    public void setID(String x){
        this.busId=x;
    } 
    public void setseatsStatus(boolean[] x){
        for(int i=0;i<42;i++){
            status[i]=x[i];
        }
        
        Obj1.setseatsStatus(this.status);
    }
    
    public String getBusId(){
        return this.busId;
    }
    public String getRoute(){
        return this.Route;
    }
    
    public void setRoute(String r){
        this.Route=r;
        Obj1.setBusRoute(this.Route);
        Obj1.ReadSeatsStatusRuntime();
        this.status=Obj1.getSeatsStatusFromFile();
    }
    public void setRoute(String r,String i){
        this.Route=r;
        Obj1.setBusId(i);
        Obj1.setBusRoute(this.Route);
        Obj1.ReadSeatsStatusRuntime();
        this.status=Obj1.getSeatsStatusFromFile();
    }
    public void setRoute1(String r,String i){
        this.Route=r;
        Obj1.setBusId(i);
        Obj1.setBusRoute(this.Route);
       
    }
    public boolean[] getSeatsStatusFromFile(){
       return this.status;
    }
    public void WriteToFileReservedSeats(){
        Obj1.WriteToFileReservedSeats();
    }
   
    
    
    public void writeinFileIDRoute(){
        try {
            Obj1.writeinFIleIDRoute();
        } catch (IOException ex) {
            Logger.getLogger(BusController.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.Route=Obj1.getRoute();
        this.busId=Obj1.getBusId();
    }
     
    
    
   
}
