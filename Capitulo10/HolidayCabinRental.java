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
public class HolidayCabinRental extends CabinRental{
    
    private Integer nRoom;
    private static final Integer SURCHARGE=150;
    
    public HolidayCabinRental(){
        super();
        this.nRoom=0;
        super.setThePrice(150.0);
    }

    public HolidayCabinRental(int cNumber, int nWeeks,int nRoom) {
        super(cNumber, nWeeks);
        this.nRoom=nRoom;
        super.setThePrice(150.0);
    }
    
    

    /**
     * @return the nRoom
     */
    public Integer getnRoom() {
        return nRoom;
    }

    /**
     * @param nRoom the nRoom to set
     */
    public void setnRoom(Integer nRoom) {
        this.nRoom = nRoom;
    }
    
    
    
}
