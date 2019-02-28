/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;

/**
 *
 * @author luisl
 */
public class Vehicle {
    private Integer nWheels;
    private Integer milePerGallon;

    public Vehicle(Integer nWheels, Integer milePerGallon) {
        this.nWheels = nWheels;
        this.milePerGallon = milePerGallon;
    }
    
    public String toString(){
        return String.format("Number of wheels: %d\nMiles per gallon: %d",this.getnWheels(),this.getMilePerGallon());
    }

    public Integer getnWheels() {
        return nWheels;
    }

    public void setnWheels(Integer nWheels) {
        this.nWheels = nWheels;
    }

    public Integer getMilePerGallon() {
        return milePerGallon;
    }

    public void setMilePerGallon(Integer milePerGallon) {
        this.milePerGallon = milePerGallon;
    }
    
    
}
