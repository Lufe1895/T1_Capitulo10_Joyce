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
public class DinnerEvent extends CarlysEventPrice{
    
    private Integer entree;
    private Integer sDish1;
    private Integer sDish2;
    private Integer dessert;
    
    private static final String[] entrees = {"Chips","Fried Banana","Mushroom Cream","Potato Cream","Cheese Fingers"};
    private static final String[] sideDishes ={"Soup","Tlayuda","Piece of Pizza","Hamburguer","Hot-Dog","Arrachera"};
    private static final String[] desserts = {"Piece of Cake","Chocolate Ice Cream","Tiramisu","Carlotta"};

    public DinnerEvent(int guests,int entree,int sDish1,int sDish2,int dessert) {
        super(guests);
        this.entree=entree;
        this.sDish1=sDish1;
        this.sDish2=sDish2;
        this.dessert=dessert;
    }
    
    public String toString(){
        return String.format("Your order is:\nEntre\u00e9: %s\nSide Dish 1: %s\nSide Dish 2: %s\nDessert: %s",
                this.entrees[this.entree],
                this.sideDishes[this.sDish1],
                this.sideDishes[this.sDish2],
                this.desserts[this.dessert]);
    }

    public Integer getEntree() {
        return entree;
    }

    public Integer getsDish1() {
        return sDish1;
    }

    public Integer getsDish2() {
        return sDish2;
    }

    public Integer getDessert() {
        return dessert;
    }
    
    
    
}
