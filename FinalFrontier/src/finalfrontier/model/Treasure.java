/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Treasure implements Serializable {
    private int loot;
    private String type;
    Random resource = new Random();
        int  whichOne = resource.nextInt(4);
    Random amount = new Random();
        int  howMuch = amount.nextInt(10);
    
    public Treasure() {
}

    public String getResource() {
        return type;
    }

    public void setResource(String type) {
        switch(whichOne){
            case 1: type = "Gold";
            case 2: type = "Wood";
            case 3: type = "Grain";
            case 4: type = "Ore";
            case 5: type = "Meat";
                }
    }
    
    //Getter for loot
    public int getLoot() {
        return loot;
    }
     //setter for loot
    public void setLoot(int loot) {
        this.loot = howMuch;
    }
    
   //hash
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.loot;
        return 0;
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
        System.out.println("Treasure{" + "loot=" + loot + '}');
        return "";
    }
    
}
