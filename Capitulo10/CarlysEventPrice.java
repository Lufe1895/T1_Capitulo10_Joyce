/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;
import Capitulo4.*;
import Capítulo3.*;
import Ejercicios_Libro.*;
import java.util.Scanner;
/**
 *
 * @author luisl
 */
public class CarlysEventPrice {
    private static final Integer PERSON=35;
    
    private Integer guests;
    private Integer total;
    
    public String carlysMotto2(){
        return String.format("*************************************************\n* Carly's makes the food that makes it a party. *\n*************************************************");
    }
    
    public CarlysEventPrice(int guests){
        this.guests=guests;
        this.total=this.guests*PERSON;
    }
    
    public String toString(){
        return String.format("Number of guests: %d\nPrice per guest: $%d\nTotal:\t\t $%d",this.guests,PERSON,this.total);
    }
    
    public Boolean isLarge(){
        return this.guests >= 50;
    }
    

    /**
     * @return the PERSON
     */
    public static Integer getPERSON() {
        return PERSON;
    }

    /**
     * @return the guests
     */
    public Integer getGuests() {
        return guests;
    }

    /**
     * @param guests the guests to set
     */
    public void setGuests(Integer guests) {
        this.guests = guests;
    }

    /**
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }
}
