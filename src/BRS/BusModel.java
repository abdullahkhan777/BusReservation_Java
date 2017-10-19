/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
public class BusModel {
    private static boolean[] ck=new boolean[42];
    private static boolean status[]=new boolean[42];
    private int IdCheck;
    private String FileName;
    private String BusId;
    private String Route;
    
    public void setBusId(String id){
        this.BusId=id;
    }
    public void setBusRoute(String r){
        this.Route=r;
    }
    public String getBusId(){
        return this.BusId;
    }
    public String getRoute(){
        return this.Route;
    }
    public void setseatsStatus(boolean[] x){
        for(int i=0;i<42;i++){
            status[i]=x[i];
            
        }
   
    }
    
    
    public void writeinFIleIDRoute() throws FileNotFoundException, IOException {
        FileReader fr1=new FileReader("Temp.txt");
        BufferedReader br1=new BufferedReader(fr1);
        this.Route=br1.readLine();
        this.BusId=br1.readLine();
         
        br1.close();
       
    }
    
    public static void setSeatStatus(boolean[] a){
        for(int i=0;i<42;i++){
            ck[i]=a[i];
        }
    }
   
    public void ReadSeatsStatusRuntime() {
        String[] x=this.BusId.split(" ");
        String id=x[1];
        
        if(Route.equals("Islamabad-Lahore")){
            FileName="Isb-Lah.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader("Isb-Lah.txt");
                
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                             
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Islamabad-Faislabad")){
            FileName="Isb-Fais.txt";
            
            
            FileReader fr1;
            try {
                fr1 = new FileReader("Isb-fais.txt");
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                           
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Islamabad-Peshawar")){
            FileName="Isb-Pes.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader("Isb-Pes.txt");
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Islamabad-Swat")){
            FileName="Isb-Swat.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Route.equals("Lahore-Islamabad")){
            FileName="Lah-Isb.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Lahore-Peshawar")){
            FileName="Lah-Pes.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Route.equals("Lahore-Faislabad")){
            FileName="Lah-Fais.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Route.equals("Lahore-Swat")){
            FileName="Lah-Swat.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Peshawar-Islamabad")){
            FileName="Pes-Isb.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Peshawar-Lahore")){
            FileName="Pes-Lah.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Peshawar-Faislabad")){
            FileName="Pes-Fais.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Route.equals("Peshawar-Swat")){
            FileName="Pes-Swat.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Route.equals("Faislabad-Islamabad")){
            FileName="Fais-Isb.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Faislabad-Lahore")){
            FileName="Fais-Lah.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Faislabad-Peshawar")){
            FileName="Fais-Pes.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        if(Route.equals("Faislabad-Swat")){
            FileName="Fais-Swat.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Swat-Islamabad")){
            FileName="Swat-Isb.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Swat-Lahore")){
            FileName="Swat-Lah.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if(Route.equals("Swat-Faislabad")){
            FileName="Swat-Fais.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                       }
                       
                    }   
                }
                if(this.IdCheck==2){
                    for(int j=0;j<43;j++){     
                        br1.readLine();
                    }
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        if(Route.equals("Swat-Peshawar")){
            FileName="Swat-Pes.txt";
            
            FileReader fr1;
            try {
                fr1 = new FileReader(FileName);
                BufferedReader br1=new BufferedReader(fr1);
                int c=0;
                for(int i=0;i<10;i++){
                    c++;
                    if(br1.readLine().equals(id)){
                        
                       if(c<5){
                           this.IdCheck=1;
                          
                       } 
                       else{
                           this.IdCheck=2;
                           
                           for(int j=0;j<43;j++){
                             
                              br1.readLine();
                           }
                       }
                    }   
                }
                for(int i=0;i<42;i++){
                this.status[i]=Boolean.parseBoolean(br1.readLine());
                
                }
                br1.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
    
    
    
    

    public boolean[] getSeatsStatusFromFile(){
       return this.status;
    }
    
    public void WriteToFileReservedSeats(){
        int cl=95;
        String[] data=new String[1000];
        try {
            
           
            FileReader fr2=new FileReader(FileName);
            BufferedReader br2=new BufferedReader(fr2);
            for(int i=0;i<cl;i++){
                data[i]=br2.readLine();
            }
            
            br2.close();
            
            if(this.IdCheck==1){
                int c=0;
                
                for(int j=10;j<52;j++){
                    for(int i=0;i<1;i++){
                        data[j]=String.valueOf(this.status[c]);
                        c++;
                    }
                }
            }
            else if(this.IdCheck==2){
                    int c=0;
                    
                    for(int j=53;j<cl;j++){

                        data[j]=String.valueOf(this.status[c]);
                        c++;
                
                }
            }
            FileWriter fw1=new FileWriter(FileName);
            BufferedWriter bw1=new BufferedWriter(fw1);
            for(int k=0;k<95;k++){
                bw1.write(data[k]+"\r\n");
            }
            bw1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BusModel.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
            
       
        
    }
    
    
    
    
}
