/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Saqib Hussain
 */
public class SwattoPes extends Route {
    private int busId;
    private String fare;
    private boolean ac;
    private String dep,arr;
       
    public void SetFirstBus(){
        try {
            FileReader fr=new FileReader("Swat-Pes.txt");
            BufferedReader br=new BufferedReader(fr);
            this.busId=Integer.parseInt(br.readLine());
            this.ac=Boolean.parseBoolean(br.readLine());
            this.fare=br.readLine();
            this.dep=br.readLine();
            this.arr=br.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IsbtoLah.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IsbtoLah.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }
    
    public void SetSecondbus(){
          try {
            FileReader fr=new FileReader("Swat-Pes.txt");
            BufferedReader br=new BufferedReader(fr);
            for(int i=0;i<5;i++){
                br.readLine();
            }
            this.busId=Integer.parseInt(br.readLine());
            this.ac=Boolean.parseBoolean(br.readLine());
            this.fare=br.readLine();
            this.dep=br.readLine();
            this.arr=br.readLine();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IsbtoLah.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IsbtoLah.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getbusid(){
        return this.busId;   
    }
    
    public boolean getBusAcstatus(){
        return this.ac;
    }
    
    public String getBusFare(){
        return this.fare;    
    }
     
    public String getBusDep(){
        return this.dep;
    }
   
    public String getBusArr(){
        return this.arr;
    }
}
