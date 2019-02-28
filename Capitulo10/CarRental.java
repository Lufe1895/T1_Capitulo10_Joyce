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
public class CarRental {
    private String name;
    private Integer code;
    private Sizes size;
    private Double dFee=0.0;
    private Integer days;
    private Double total=0.0;

    public CarRental(String name, Integer code, Sizes size, Integer days) {
        this.name = name;
        this.code = code;
        this.size = size;
        this.days = days;
        setdFee();
        setTotal();
    }
    
    public void display(){
        System.out.println("Renter's name: "+this.getName()+
                "\nZip code: "+this.getCode()+
                "\nSize of the car: "+this.getSize()+
                "\nDaily fee: "+this.getdFee()+
                "\nDays rented: "+this.getDays()+
                "\nTotal: $"+this.getTotal());
    }
    
    private void setdFee(){
        if(size == Sizes.ECONOMY){
            this.dFee+=29.99;
        }else if(size==Sizes.MIDSIZE){
            this.dFee+=38.99;
        }else{
            this.dFee+=43.5;
        }
    }
    
    void setdFee(double nFee){
        this.dFee+=nFee;
    }
    
    void setTotal(){
        this.total += this.dFee * this.days;
    }
    
    void setdFee(Boolean bool){
        if(bool){
            this.dFee+=200.0;
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @return the size
     */
    public Sizes getSize() {
        return size;
    }

    /**
     * @return the dFee
     */
    public Double getdFee() {
        return dFee;
    }

    /**
     * @return the days
     */
    public Integer getDays() {
        return days;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }
    
    
    
}
