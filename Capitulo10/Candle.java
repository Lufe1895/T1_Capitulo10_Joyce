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
public class Candle {
    private String color;
    private Double height;
    Double price;

    public Candle(String color, Double height) {
        this.color = color;
        this.height = height;
        calcularPrecio();
    }
    
    public Candle() {
        this.color = "";
        this.height = 0.0;
    }
    
    private void calcularPrecio(){
        this.price=this.height*2;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the height
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(Double height) {
        this.height = height;
        calcularPrecio();
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    
    
}
