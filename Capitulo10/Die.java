/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capitulo10;

import Capitulo4.*;

/**
 *
 * @author luisl
 */
public class Die {
    protected Integer number;
    
    public Die(){
        this.number=(int)(Math.random()*6+1);
    }

    /**
     * @return the number
     */
    public Integer getNumber() {
        return number;
    }
    
    public void roll(){
        this.number=(int)(Math.random()*6+1);
    }
    
}
