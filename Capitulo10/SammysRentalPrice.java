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
public class SammysRentalPrice {
    private static final Integer HOUR=60;
    
    private Integer minute;
    private Integer reminder;
    private Integer price;
    
    public SammysRentalPrice(int minutes){
        this.minute=minutes/HOUR;
        this.reminder=minutes%HOUR;
        this.price=this.minute*40+this.reminder;
    }
    
    public String motto(){
        return String.format("ssssssssssssssssssssssssssssssssssss\ns Sammy's makes it fun in the sun. s\nssssssssssssssssssssssssssssssssssss");
    }
    
    public String toString(){
        return String.format("Hours: \t\t%d\nMinutes: \t%d\nTotal: \t\t$%d",this.minute,this.reminder,this.price);
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int minutes;
        
        System.out.println("Input minutes:");
        minutes=Sc.nextInt();
        
        SammysRentalPrice total = new SammysRentalPrice(minutes);
        
        System.out.println(total.motto());
        System.out.println(total.toString());
    }

    /**
     * @return the HOUR
     */
    public static Integer getHOUR() {
        return HOUR;
    }

    /**
     * @return the minute
     */
    public Integer getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    /**
     * @return the reminder
     */
    public Integer getReminder() {
        return reminder;
    }

    /**
     * @param reminder the reminder to set
     */
    public void setReminder(Integer reminder) {
        this.reminder = reminder;
    }

    /**
     * @return the price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}
