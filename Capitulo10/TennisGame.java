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
public class TennisGame {
    private String p1;
    private String p2;
    private Integer score1;
    private Integer score2;
    private String fScore1;
    private String fScore2;
    
    public TennisGame(){
        this.p1="";
        this.p2="";
        this.score1=0;
        this.score2=0;
        this.fScore1="";
        this.fScore2="";
    }
    
    public void setNames(String p1, String p2){
        this.p1=p1;
        this.p2=p2;
    }
    
    public String toString(){
        return String.format("Player 1: %s\nPlayer 2: %s\nPlayer 1 Score: %d, %s\nPlayer 2 Score %d, %s\n\n",this.p1,this.p2,this.score1,this.fScore1,this.score2,this.fScore2);
    }

    public TennisGame(String p1, String p2, Integer score1, Integer score2) {
        this.p1 = p1;
        this.p2 = p2;
        if((score1 < 0 || score2 < 0) || (score1 > 4 || score2 > 4) || (score1==4 && score2 == 4)){
            this.score1=0;
            this.score2=0;
            this.fScore1="error";
            this.fScore2="error";
        }
        else{
            this.score1 = score1;
            this.score2 = score2;
            if(score1==0){
                this.fScore1 = "Love";
            }else if(score1==1){
                this.fScore1 = "15";
            }else if(score1==2){
                this.fScore1 = "30";
            }else if(score1==3){
                this.fScore1 = "40";
            }else{
                this.fScore1 = "Game";
            }
            
            if(score2==0){
                this.fScore2 = "Love";
            }else if(score2==1){
                this.fScore2 = "15";
            }else if(score2==2){
                this.fScore2 = "30";
            }else if(score2==3){
                this.fScore2 = "40";
            }else{
                this.fScore2 = "Game";
            }
        }
    }
    
    private void comprobar(){
        if((this.score1 < 0 || this.score2 < 0) || (this.score1 > 4 || this.score2 > 4) || (this.score1==4 && this.score2 == 4)){
            this.score1=0;
            this.score2=0;
            this.fScore1="error";
            this.fScore2="error";
        }
    }

    /**
     * @return the p1
     */
    public String getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(String p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public String getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(String p2) {
        this.p2 = p2;
    }

    /**
     * @return the score1
     */
    public Integer getScore1() {
        return score1;
    }

    /**
     * @param score1 the score1 to set
     */
    public void setScore1(Integer score1) {
        this.score1 = score1;
            if(score1==0){
                this.fScore1 = "Love";
            }else if(score1==1){
                this.fScore1 = "15";
            }else if(score1==2){
                this.fScore1 = "30";
            }else if(score1==3){
                this.fScore1 = "40";
            }else{
                this.fScore1 = "Game";
            }
            comprobar();
    }

    /**
     * @return the score2
     */
    public Integer getScore2() {
        return score2;
    }

    /**
     * @param score2 the score2 to set
     */
    public void setScore2(Integer score2) {
        this.score2 = score2;
        if(score2==0){
                this.fScore2 = "Love";
            }else if(score2==1){
                this.fScore2 = "15";
            }else if(score2==2){
                this.fScore2 = "30";
            }else if(score2==3){
                this.fScore2 = "40";
            }else{
                this.fScore2 = "Game";
            }
        comprobar();
    }

    /**
     * @return the fScore1
     */
    public String getfScore1() {
        return fScore1;
    }


    /**
     * @return the fScore2
     */
    public String getfScore2() {
        return fScore2;
    }
    
    
}
