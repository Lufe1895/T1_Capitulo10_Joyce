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
public class LeapYear extends Year{
    
    public LeapYear(){
        super.setDays(366);
    }
    
    public Integer daysElapsed(int month,int day){
        int sum,res;
        switch(month){
            case 1:
                sum=0+day;
                res=super.getDays()-sum;
                break;
            case 2:
                sum=31+day;
                res=super.getDays()-sum;
                break;
            case 3:
                sum=60+day;
                res=super.getDays()-sum;
                break;
            case 4:
                sum=91+day;
                res=super.getDays()-sum;
                break;
            case 5:
                sum=121+day;
                res=super.getDays()-sum;
                break;
            case 6:
                sum=152+day;
                res=super.getDays()-sum;
                break;
            case 7:
                sum=182+day;
                res=super.getDays()-sum;
                break;
            case 8:
                sum=213+day;
                res=super.getDays()-sum;
                break;
            case 9:
                sum=244+day;
                res=super.getDays()-sum;
                break;
            case 10:
                sum=274+day;
                res=super.getDays()-sum;
                break;
            case 11:
                sum=305+day;
                res=super.getDays()-sum;
                break;
            case 12:
                sum=335+day;
                res=super.getDays()-sum;
                break;
            default:
                sum=0;
                res=super.getDays()-sum;
                break;
        }
        return res;
    }
}
