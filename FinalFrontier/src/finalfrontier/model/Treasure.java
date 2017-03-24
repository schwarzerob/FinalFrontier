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
        int  whichOne = resource.nextInt(5);
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
                    Resources.gold+=howMuch;
            case 2: type = "Wood";
                    Resources.wood+=howMuch;
            case 3: type = "Grain";
                    Resources.grain+=howMuch;
            case 4: type = "Ore";
                    Resources.ore+=howMuch;
            case 5: type = "Sheep";
                    Resources.sheep+=howMuch;
            case 6: type = "Nothing";
                }
    }
    
    //Getter for loot
    public int getLoot() {
        return loot;
    }
     //setter for loot
    public void setLoot(int loot) {
        this.loot = howMuch;
    System.out.println(type + ": " + howMuch);
    }

    @Override
    public String toString() {
        System.out.println("Treasure{" + "loot=" + loot + '}');
        return "";
    }
    
}
