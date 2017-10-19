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
abstract class Route {
    private int RouteId;
    private String name;
    
    abstract void SetFirstBus();
    abstract void SetSecondbus();
    
    abstract int getbusid();
    
    abstract boolean getBusAcstatus();
    
    abstract String getBusFare();
    
    abstract String getBusDep();
    
    abstract String getBusArr();
    
    
    
    
    
}
