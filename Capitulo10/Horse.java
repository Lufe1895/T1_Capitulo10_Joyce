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
public class Horse {
    private String name;
    private String color;
    private Integer year;

    public Horse(String name, String color, Integer year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }
    
    public Horse() {
        this.name = "";
        this.color = "";
        this.year = 0;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the year
     */
    public Integer getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(Integer year) {
        this.year = year;
    }
    
    
    
}
