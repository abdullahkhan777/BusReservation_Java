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
public class PassengerController {
    private String name,age,gender,phone,cnic;
    PassengerModel Obj1=new PassengerModel();
    
    public void setpassengerandWriteToFile(String n,String age,String gen,String ph,String cnic){
        this.name=n;
        this.age=age;
        this.gender=gen;
        this.phone=ph;
        this.cnic=cnic;
        Obj1.setpassenger(n, age, gen, ph, cnic);
        Obj1.writeToFilePassengerInfo();
        
    }
    public void setIdRouteSeatsandWriteToFile(String id,String route,String Seat){
       Obj1.writeToFilePassengerInfo(id, route,Seat);
        
        
    }
    
}
