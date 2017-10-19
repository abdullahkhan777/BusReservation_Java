/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saqib Hussain
 */
public class LocationController {
    private int indexFrom,indexTo;
    private int IdEntered;
    private String Location;
    LocationModel Obj1 =new LocationModel();
     private int BusId;
     String Route;
    private String Fare;
    private boolean Ac;
    private String DepartureTime,ArrivalTime;
    
    public void setIndex(int From,int To){
        this.indexFrom=From;
        this.indexTo=To;
    }
    public int getIndexFrom(){
        return this.indexFrom;
    }
    public int getIndexTo(){
        return this.indexTo;
    }
     public void show(){
      System.out.println(this.indexFrom+"\n"+this.indexTo);
    }
    public void sendIndexesToModel(){
       
       Obj1.setIndex(this.indexFrom, this.indexTo);
        
    }
    public void setFirstBus(){
        
        Obj1.setIndex(this.indexFrom, this.indexTo);
        
        Obj1.setLocationsFromFrame();
        Obj1.setFirstBus();
        this.Route=Obj1.getRoute();
        this.BusId=Obj1.getBusId();
        this.Ac=Obj1.getAcStatus();
        this.Fare=Obj1.getFare();
        this.DepartureTime=Obj1.getDep();
        this.ArrivalTime=Obj1.getArr();
    }
    public void setSecondBus(){
        Obj1.setSecondBus();
        this.BusId=Obj1.getBusId();
        this.Ac=Obj1.getAcStatus();
        this.Fare=Obj1.getFare();
        this.DepartureTime=Obj1.getDep();
        this.ArrivalTime=Obj1.getArr();
    }
    public int getBusId(){
        return this.BusId;
        
    }
    public String getFare(){
        return this.Fare;
    }
    public String  getAcStatus(){
        if(this.Ac==true){
            return "yes";
        }
        else{
            return "No";
        }
    }
    public String getDep(){
        return this.DepartureTime;
    }
    public String getArr(){
        return this.ArrivalTime;
    }
    public String getRoute(){
        return this.Route;
    }
    public void saveIDRouteInfile() {
        try {
            Obj1.saveIDRouteInfile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LocationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setIdEntered(int x)
    {
       this.IdEntered=x;
       Obj1.setIdEntered(x);
    }
    public int getRequestedId(){
        int x;
        x=Obj1.getRequestedID();
        return x;
    }
    
}

