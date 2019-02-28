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
public class LoadedDie extends Die {

    public LoadedDie() {
        super.number=(int)(Math.random()*5+2);
    }

    public Integer getNumber() {
        return number;
    }
    
    public void roll(){
        super.number=(int)(Math.random()*5+2);
    }
    
}
