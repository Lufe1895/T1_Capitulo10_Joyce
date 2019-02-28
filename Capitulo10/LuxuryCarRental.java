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
public class LuxuryCarRental extends CarRental{
    private Boolean chauffer;
    private final static Double EXTRA = 79.99;

    public LuxuryCarRental(String name, Integer code, Sizes size, Integer days, char conf) {
        super(name, code, size, days);
        if(conf == 'Y' || conf == 'y'){
            this.chauffer=true;
        }
        else{
            this.chauffer=false;
        }
        super.setdFee(EXTRA);
        super.setdFee(chauffer);
        super.setTotal();
    }
    
    public void display(){
        System.out.println("Renter's name: "+super.getName()+
                "\nZip code: "+super.getCode()+
                "\nSize of the car: "+super.getSize()+
                "\nDaily fee: "+super.getdFee()+
                "\nDays rented: "+super.getDays()+
                "\nChauffer: "+this.chauffer+
                "\nTotal: $"+super.getTotal());
    }
    
}
