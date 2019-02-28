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
public class Year {
    private Integer days;

    
    public Year(){
        this.days=365;
    }
    
    public Integer daysElapsed(int month,int day){
        int sum,res;
        switch(month){
            case 1:
                sum=0+day;
                res=this.days-sum;
                break;
            case 2:
                sum=31+day;
                res=this.days-sum;
                break;
            case 3:
                sum=59+day;
                res=this.days-sum;
                break;
            case 4:
                sum=90+day;
                res=this.days-sum;
                break;
            case 5:
                sum=120+day;
                res=this.days-sum;
                break;
            case 6:
                sum=151+day;
                res=this.days-sum;
                break;
            case 7:
                sum=181+day;
                res=this.days-sum;
                break;
            case 8:
                sum=212+day;
                res=this.days-sum;
                break;
            case 9:
                sum=243+day;
                res=this.days-sum;
                break;
            case 10:
                sum=273+day;
                res=this.days-sum;
                break;
            case 11:
                sum=304+day;
                res=this.days-sum;
                break;
            case 12:
                sum=334+day;
                res=this.days-sum;
                break;
            default:
                sum=0;
                res=this.days-sum;
                break;
        }
        return res;
    }

    /**
     * @return the days
     */
    public Integer getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    void setDays(Integer days) {
        this.days = days;
    }

    
    
    
}
