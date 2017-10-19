/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saqib Hussain
 */
public class LocationModel {
    private int indexFrom,indexTo,IDcheck;
    private String From,To;
    private String Fare1,Fare2;
    private String Dep1,Dep2;
    private String Route;
    private int IdEntered;
    private int FirstBusId,SecondBusId;
     private int BusId;
    private String Fare;
    private boolean Ac;
    private String DepartureTime,ArrivalTime;
    
   
    public void setIndex(int f,int to){
        this.indexFrom=f;
        this.indexTo=to;
        
    }
    
    public void setLocationsFromFrame(){
        
        if(indexFrom==0){
            this.From="Islamabad";
        }
        else if(indexFrom==1){
            this.From="Lahore";
        }
        else if(indexFrom==2){
            this.From="Peshawar";
        }
        else if(indexFrom==3){
            this.From="Faislabad";
        }
        else if(indexFrom==4){
            this.From="Swat";
        }
        else{
            System.out.println("Error getting value from index of 'From'");
        }
        if(indexTo==0){
            this.To="Islamabad";
        }
        else if(indexTo==1){
            this.To="Lahore";
        }
        else if(indexTo==2){
            this.To="Peshawar";
        }
        else if(indexTo==3){
            this.To="Faislabad";
        }
        else if(indexTo==4){
            this.To="Swat";
        }
        else{
            System.out.println("Error getting value from index of To");
        }
       
      
        
        
    }//end of function setlocations
     
   
    
    public void setFirstBus(){
        Route=this.From+"-"+this.To;        
        if(Route.equals("Islamabad-Lahore")){
            Route r1=new IsbtoLah();
            
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
        }
        else if(Route.equals("Islamabad-Peshawar")){
            Route r1=new IsbtoPes();
            
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
        }
        else if(Route.equals("Islamabad-Faislabad")){
            Route r1=new IsbtoFais();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
        }
        
         else if(Route.equals("Islamabad-Swat")){
            Route r1=new IsbtoSwat();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Lahore-Islamabad")){
            Route r1=new LahtoIsb();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Lahore-Peshawar")){
            Route r1=new LahtoPes();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Lahore-Faislabad")){
            Route r1=new LahtoFais();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Lahore-Swat")){
            Route r1=new LahtoSwat();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Faislabad-Islamabad")){
            Route r1=new FaistoIsb();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Faislabad-Lahore")){
            Route r1=new FaistoLah();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Faislabad-Peshawar")){
            Route r1=new FaistoPes();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Faislabad-Swat")){
            Route r1=new FaistoSwat();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Peshawar-Islamabad")){
            Route r1=new PestoIsb();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Peshawar-Lahore")){
            Route r1=new PestoLah();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Peshawar-Faislabad")){
            Route r1=new PestoFais();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Peshawar-Swat")){
            Route r1=new PestoSwat();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Swat-Islamabad")){
            Route r1=new SwattoIsb();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Swat-Lahore")){
            Route r1=new SwattoLah();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Swat-Peshawar")){
            Route r1=new SwattoPes();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
         else if(Route.equals("Swat-Faislabad")){
            Route r1=new SwattoFais();
            r1.SetFirstBus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.FirstBusId=r1.getbusid();
         }
        else{
            System.out.println(From+"\n"+To);
        }
        this.Fare1=this.Fare;
        this.Dep1=this.DepartureTime;
//------------------------------------------------------------------------------------------------------------------------
    }
    public void setSecondBus(){
        Route=this.From+"-"+this.To;
        if(Route.equals("Islamabad-Lahore")){
            Route r1=new IsbtoLah();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Islamabad-Peshawar")){
            Route r1=new IsbtoPes();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Islamabad-Faislabad")){
            Route r1=new IsbtoFais();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Islamabad-Swat")){
            Route r1=new IsbtoSwat();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Lahore-Islamabad")){
            Route r1=new LahtoIsb();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Lahore-Peshawar")){
            Route r1=new LahtoPes();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Lahore-Faislabad")){
            Route r1=new LahtoFais();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Lahore-Swat")){
            Route r1=new LahtoSwat();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Faislabad-Islamabad")){
            Route r1=new FaistoIsb();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Faislabad-Lahore")){
            Route r1=new FaistoLah();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Faislabad-Peshawar")){
            Route r1=new FaistoPes();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Faislabad-Swat")){
            Route r1=new FaistoSwat();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Peshawar-Islamabad")){
            Route r1=new PestoIsb();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Peshawar-Lahore")){
            Route r1=new PestoLah();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
         else if(Route.equals("Peshawar-Faislabad")){
            Route r1=new PestoFais();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Peshawar-Swat")){
            Route r1=new PestoSwat();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Swat-Islamabad")){
            Route r1=new SwattoIsb();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Swat-Lahore")){
            Route r1=new SwattoLah();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Swat-Peshawar")){
            Route r1=new SwattoPes();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        else if(Route.equals("Swat-Faislabad")){
            Route r1=new SwattoFais();
            r1.SetSecondbus();
            this.BusId=r1.getbusid();
            this.Ac=r1.getBusAcstatus();
            this.Fare=r1.getBusFare();
            this.DepartureTime=r1.getBusDep();
            this.ArrivalTime=r1.getBusArr();
            this.SecondBusId=r1.getbusid();
        }
        this.Fare2=this.Fare;
        this.Dep2=this.DepartureTime;
    }
    
    public int getBusId(){
        return this.BusId;
        
    }
    public String getFare(){
        return this.Fare;
    }
    public boolean getAcStatus(){
        return this.Ac;
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
    
    public void setIdEntered(int x)
    {
       this.IdEntered=x;
       
    }
    public int getRequestedID(){
        if(this.IdEntered==this.FirstBusId){
            this.IDcheck=1;
            
            try {
                FileWriter fr1=new FileWriter("FareTemp.txt");
                PrintWriter pr1=new PrintWriter(fr1);
                pr1.write(this.Fare1);
                pr1.close();
                
            } catch (IOException ex) {
                Logger.getLogger(LocationModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
           return this.FirstBusId;
            
       }
        else if(this.IdEntered==this.SecondBusId){
            this.IDcheck=2;
            try {
                FileWriter fr1=new FileWriter("FareTemp.txt");
                PrintWriter pr1=new PrintWriter(fr1);
                pr1.write(this.Fare2);
                pr1.close();
                
            } catch (IOException ex) {
                Logger.getLogger(LocationModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            return this.SecondBusId;
        }
        else{
            return 0;
        }
        
        
    }
    
    public void saveIDRouteInfile() throws FileNotFoundException{
        this.saveDepartureTimeinFile();
       File f1=new File("Temp.txt");
       PrintWriter pr=new PrintWriter(f1);
       if(this.IDcheck==1){
           pr.println(this.Route+"\r\n"+this.FirstBusId);
           System.out.println(this.Route);
           pr.close();
           
       }
       else if(this.IDcheck==2){
           pr.println(this.Route+"\r\n"+this.SecondBusId);
           pr.close();
          
       }
       
    }
   
    public void saveDepartureTimeinFile(){
        
        try {
            File f2=new File("DepartureTime.txt");
            PrintWriter pr2=new PrintWriter(f2);
            if(this.IDcheck==1){
                pr2.println(this.Dep1);
            }
            else if(this.IDcheck==2){
                pr2.println(this.Dep2);
            }
            pr2.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LocationModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   
    

}//end of Class..........................................................................................................!
