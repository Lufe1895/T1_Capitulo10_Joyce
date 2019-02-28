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
public class DoublesTennisGame extends TennisGame {
    private String pp1;
    private String pp2;
    
    public DoublesTennisGame(){
        super();
        this.pp1="";
        this.pp2="";
    }

    public DoublesTennisGame(String p1, String p2, Integer score1, Integer score2, String pp1, String pp2) {
        super(p1, p2, score1, score2);
        this.pp1 = pp1;
        this.pp2 = pp2;
    }
    
    public void setNames(String p1, String p2, String p3, String p4){
        super.setP1(p1);
        super.setP2(p2);
        this.setPp1(p3);
        this.setPp2(p4);
    }
    
    public String toString(){
        return String.format("Player 1: %s\nPlayer 1 Companion: %s\nPlayer 2: %s\nPlayer 2 Companion: %s\nPlayer 1 Score: %d, %s\nPlayer 2 Score %d, %s\n\n",
                super.getP1(),
                this.pp1,
                super.getP2(),
                this.pp2,
                super.getScore1(),
                super.getfScore1(),
                super.getScore2(),
                this.getfScore2());
    }

    /**
     * @return the pp1
     */
    public String getPp1() {
        return pp1;
    }

    /**
     * @param pp1 the pp1 to set
     */
    public void setPp1(String pp1) {
        this.pp1 = pp1;
    }

    /**
     * @return the pp2
     */
    public String getPp2() {
        return pp2;
    }

    /**
     * @param pp2 the pp2 to set
     */
    public void setPp2(String pp2) {
        this.pp2 = pp2;
    }
    
    
    
}
