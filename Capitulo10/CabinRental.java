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
public class CabinRental {
    private Integer cNumber;
    private Integer nWeeks;
    private Double rRate;
    private Double price=0.0;
    
    public CabinRental(){
        this.cNumber=0;
        this.nWeeks=0;
    }
    
    public CabinRental(int cNumber, int nWeeks){
        this.cNumber=cNumber;
        this.nWeeks=nWeeks;
        this.rRate=setPrice();
    }
    
    private double setPrice(){
        if(this.getcNumber()>=1 && this.getcNumber() <=3){
            this.price+=950;
            return this.getnWeeks() * this.price;
        }
        else{
            this.price+=1100;
            return this.getnWeeks() * this.price;
        }
    }

    /**
     * @return the cNumber
     */
    public Integer getcNumber() {
        return cNumber;
    }

    /**
     * @param cNumber the cNumber to set
     */
    public void setcNumber(Integer cNumber) {
        this.cNumber = cNumber;
    }

    /**
     * @return the nWeeks
     */
    public Integer getnWeeks() {
        return nWeeks;
    }

    /**
     * @param nWeeks the nWeeks to set
     */
    public void setnWeeks(Integer nWeeks) {
        this.nWeeks = nWeeks;
        this.rRate=setPrice();
    }
    
    public void setThePrice(Double price){
        this.price+=price;
    }

    /**
     * @return the rRate
     */
    public Double getrRate() {
        return rRate;
    }
    
    
}
