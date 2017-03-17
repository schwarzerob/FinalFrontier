/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Craft implements Serializable {
    private int neededResources;
    private String create;
    private int amountRequired; 
    
    public Craft () {
    }
 // Getter for NeededResources, Create, AmountRequired

    public int getNeededResources() {
        return neededResources;
    }

    public String getCreate() {
        return create;
    }

    public int getAmountRequired() {
        return amountRequired;
    }
    
    // setter for NeededResources, Create, AmountRequired

    public void setNeededResources(int neededResources) {
        this.neededResources = neededResources;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public void setAmountRequired(int amountRequired) {
        this.amountRequired = amountRequired;
    }
    //hash

    public enum CraftingItems {
    Sword("You just crafted a sword!", 10, 0, 15, 0, 20),
    Shield("You just crafted a shield!", 15, 0, 20, 0, 21),
    Bow("You just crafted a bow!", 15, 0, 0, 2, 10),
    String("You just crafted a string", 0, 5, 0, 20, 10),
    Wagon("You made your wagon bigger!", 15, 17, 23, 7, 25);
    private final String description;
    private final int wood;
    private final int grain;
    private final int ore;
    private final int sheep;    
    private final int gold;
    CraftingItems(String desc,int woodAmnt, int grainAmnt, int oreAmnt, int sheepAmnt, int goldAmnt){
        description = desc;
        wood = woodAmnt;
        grain = grainAmnt;
        ore = oreAmnt;
        sheep = sheepAmnt;
        gold = goldAmnt;
    }
    public String getDescription(){
        return description;
    }
    public int getWood(){
        return wood;
    }
    public int getGrain(){
        return grain;
    }
    public int getOre(){
        return ore;
    }
    public int getSheep(){
        return sheep;
    }
    
    public int getGold(){
        return gold;
    }
    }  
    @Override
    public String toString() {
        return "Craft{" + "neededResources=" + neededResources + ", create=" + create + ", amountRequired=" + amountRequired + '}';
    }
    
}