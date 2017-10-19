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
public class ScheduleController {
    private ScheduleModel obj1=new ScheduleModel();
    public void setRouteId(int x){
        obj1.setRouteId(x);
        obj1.setFileNameToOpen();
        obj1.setSceduleDataFromFileFromfile();
    }
    public String[] getData(){
        return obj1.getData();
    }
    
}
