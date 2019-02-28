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
public class InsuredPackage extends Package {

    public InsuredPackage(Double weight, ShippingMethod method) {
        super(weight, method);
        if(super.getCost()>0.0 && super.getCost()<=1.00){
            super.setCost(2.45);
        }else if(super.getCost()<=3.00){
            super.setCost(3.95);
        }else{
            super.setCost(5.55);
        }
    }
    
    
}
