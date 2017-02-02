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
   //hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.loot;
        return hash;
    }
// equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Treasure other = (Treasure) obj;
        if (this.loot != other.loot) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Treasure{" + "loot=" + loot + '}';
    }
    
}
