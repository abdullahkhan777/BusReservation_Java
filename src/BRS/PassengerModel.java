/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saqib Hussain
 */
public class PassengerModel {
    private String name,nationality,gender,phone,cnic,busid,route;
    private String[] seats;
    
    public void setpassenger(String n,String gen,String ph,String cnic,String nat){
        this.name=n;
        this.nationality=nat;
        this.gender=gen;
        this.phone=ph;
        this.cnic=cnic;
        
    }
    
    public void writeToFilePassengerInfo(){
        try {
            FileWriter fr1=new FileWriter("PassengerTemp.txt");
            PrintWriter pr1=new PrintWriter(fr1);
            pr1.write(this.name+"\r\n"+this.gender+"\r\n"+this.phone+"\r\n"+this.cnic+"\r\n"+this.nationality);
            pr1.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(PassengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void writeToFilePassengerInfo(String id,String route,String seats){
        try {
            FileWriter fr1=new FileWriter("PassengerTemp.txt",true);
            PrintWriter pr1=new PrintWriter(fr1,true);
            pr1.append("\r\n"+id+"\r\n"+route+"\r\n"+seats);
            pr1.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(PassengerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
