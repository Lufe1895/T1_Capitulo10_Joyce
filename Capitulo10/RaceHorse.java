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
public class RaceHorse extends Horse {
    private Integer nRaces;

    public RaceHorse(String name, String color, Integer year, Integer nRaces) {
        super(name, color, year);
        this.nRaces=nRaces;
    }

    public RaceHorse() {
        super();
        this.nRaces=0;
    }

    /**
     * @return the nRaces
     */
    public Integer getnRaces() {
        return nRaces;
    }

    /**
     * @param nRaces the nRaces to set
     */
    public void setnRaces(Integer nRaces) {
        this.nRaces = nRaces;
    }
    
    
    
    
}
