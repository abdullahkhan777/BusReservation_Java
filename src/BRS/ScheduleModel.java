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
public class ScheduleModel {
    private int RouteId;
    private String FileName="abc";
    private String[] Data=new String[10];
    
    public void setRouteId(int x){
        this.RouteId=x;
    }
    
    public void setFileNameToOpen(){
        String[] x=new String[20];
        try {
            FileReader fr1=new FileReader("FileNames.txt");
            BufferedReader br1=new BufferedReader(fr1);
            for(int i=0;i<20;i++){
                x[i]=br1.readLine();
            }
            br1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScheduleModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ScheduleModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        FileName=x[RouteId];
        
    }
    
    public void setSceduleDataFromFileFromfile(){
        try {
            FileReader fr1 = new FileReader(FileName);
            BufferedReader br1=new BufferedReader(fr1);
            for(int i=0;i<10;i++){
                Data[i]=br1.readLine();
            }
            br1.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScheduleModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ScheduleModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public String[] getData(){
        return this.Data;  
    }
    
    
}
