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
public class AdminModel {
    private int found=0;
    private String Password,Route,BusId,Seatid,fare,Date,DepT,Name,Cnic,Phone,Btime,Bdate;
    
    public String getsecretCode(){
        try {
            String code;
            FileReader fr1=new FileReader("Admin.txt");
            BufferedReader br1=new BufferedReader(fr1);
            br1.readLine();
            code=br1.readLine();
            br1.close();
            return code;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return "null";
    }
    
    public boolean checkAdminPassword(String pass){
        
        try {
            FileReader fr1=new FileReader("AdminPass.txt");
            BufferedReader br1=new BufferedReader(fr1);
            this.Password=br1.readLine();
            br1.close();
            if(this.Password.equals(pass)){
                return true;
            }
            else{
                return false;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public void ChangeCurrentPassword(String x){
        try {
            FileWriter fw1=new FileWriter("AdminPass.txt");
            PrintWriter pr1=new PrintWriter(fw1);
            pr1.write(x);
            pr1.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ChangeCurrentPassword(int x){
        try {
            FileWriter fw1=new FileWriter("AdminPass.txt");
            PrintWriter pr1=new PrintWriter(fw1);
            pr1.write(x);
            pr1.close();
        } catch (IOException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void ClearPassengersRecords(int x){
        if(x==0){
            FileWriter fw1;
            try {
                fw1 = new FileWriter("PassengersData.txt");
                PrintWriter pr1=new PrintWriter(fw1);
                pr1.write("");
                pr1.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
    public void clearSeatsCompletely(int z){
            if(z==0){
            try {
                String[] fileName=new String [20];
                FileReader fr1=new FileReader("TextFileNames.txt");
                BufferedReader br1=new BufferedReader(fr1);
                //reading filenames to be accessed and saving to a string[]
                for(int i=0;i<20;i++){
                    fileName[i]=br1.readLine();
                }
                br1.close();

                for (int main=0;main<20;main++){
                    String[] data=new String[95];
                    FileReader fr2=new FileReader(fileName[main]);
                    BufferedReader br2=new BufferedReader(fr2);
                    for(int k=0;k<95;k++){
                        data[k]=br2.readLine();
                    }

                    br2.close();


                    FileReader fr3 =new FileReader("ResetSeatsAllocation.txt");
                    BufferedReader br3=new BufferedReader(fr3);
                    //changing data from line 10 to 95
                    for(int j=10;j<95;j++){
                        data[j]=br3.readLine();                  
                    }
                    br3.close();
                    //clearing data from route files..
                     FileWriter fw1=new FileWriter(fileName[main]);
                    PrintWriter pw1=new PrintWriter(fw1);
                    pw1.write("");
                    pw1.close();



                    //write data[] back to file after reseting seats status to false
                    FileWriter fw2=new FileWriter(fileName[main],true);
                    PrintWriter pw2=new PrintWriter(fw2,true);

                    for(int x=0;x<95;x++){
                        if(x==0){
                            pw2.append(data[x]);
                        }
                        else{
                        pw2.append("\r\n"+data[x]);
                        }
                    }
                    pw2.close();
                }


            } catch (FileNotFoundException ex) {
                Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void resetTicketNumberSequence(int b){
        if(b==0){
            FileWriter fw1;
            try {
                fw1 = new FileWriter("TicNumber.txt");
                PrintWriter pw1=new PrintWriter(fw1);
                pw1.write("1000");
                pw1.close();
            } catch (IOException ex) {
                Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void BookingInquiry(String tick){
         found=0;
        try {
            int counter=0;
            FileReader fr1 = new FileReader("PassengersData.txt");
            BufferedReader br1=new BufferedReader(fr1);
            br1.readLine(); //bypass/reads the first empty line
            while(br1.readLine()!=null){
                counter++;
            }
            br1.close();
            
            FileReader fr2 = new FileReader("PassengersData.txt");
            BufferedReader br2=new BufferedReader(fr2);
            for(int i=0;i<counter;i++){
                if(tick.equals(br2.readLine())){
                    this.found=1;
                    this.Route=br2.readLine();
                    this.BusId=br2.readLine();
                    this.Seatid=br2.readLine();
                    this.fare=br2.readLine();
                    this.Date=br2.readLine();
                    this.DepT=br2.readLine();
                    this.Name=br2.readLine();
                    this.Cnic=br2.readLine();
                    this.Phone=br2.readLine();
                    this.Bdate=br2.readLine();
                    this.Btime=br2.readLine();
                    i=counter;
                    br2.close();
                    break;
                }
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminModel.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
    
    public int getFound(){
        return this.found;
    }
    
    public String getRoute(){
        return this.Route;
    }
    public String getBusID(){
        return this.BusId;
    }
    public String getSeatsID(){
        return this.Seatid;
    }
    public String getFare(){
        return this.fare;
    }
    public String getDate(){
        return this.Date;
    }
    public String getDepartTime(){
        return this.DepT;
    }
    public String getName(){
        return this.Name;
    }
    public String getCnic(){
        return this.Cnic;
    }
    public String getPhone(){
        return this.Phone;
    }
    public String getBookingDate(){
        return this.Bdate;
    }
    public String getBookingTime(){
        return this.Btime;
    }
    
}
