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
public class Alien {
    protected Integer nEyes;
    protected Integer nArms;
    protected String color;

    public Alien(Integer nEyes, Integer nArms, String color) {
        this.nEyes = nEyes;
        this.nArms = nArms;
        this.color = color;
    }
    
    public String toString(){
        return String.format("Number of eyes: %d\nNumber of arms: %d\nColor: %s\n\n",this.getnEyes(),this.getnArms(),this.getColor());
    }

    public Integer getnEyes() {
        return nEyes;
    }

    public void setnEyes(Integer nEyes) {
        this.nEyes = nEyes;
    }

    public Integer getnArms() {
        return nArms;
    }

    public void setnArms(Integer nArms) {
        this.nArms = nArms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
