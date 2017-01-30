/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Treasure implements Serializable {
    private int loot;
    
    public Treasure() {
    
}
    //Getter for loot

    public int getLoot() {
        return loot;
    }
     //setter for loor

    public void setLoot(int loot) {
        this.loot = loot;
    }
    
}
