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
public class ScentedCandle extends Candle {
    private String scent;

    public ScentedCandle(String color, Double height, String scent) {
        super(color, height);
        this.scent=scent;
        calcularPrecio();
    }

    public ScentedCandle() {
        super();
        this.scent="";
    }

    private void calcularPrecio(){
        this.price=3*super.getHeight();
    }

    /**
     * @return the scent
     */
    public String getScent() {
        return scent;
    }

    /**
     * @param scent the scent to set
     */
    public void setScent(String scent) {
        this.scent = scent;
    }
    
    
    
}
