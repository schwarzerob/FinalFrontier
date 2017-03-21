/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

/**
 *
 * @author rschw
 */
public enum CraftingItems {
    SWORD("You just crafted a sword!", 10, 0, 15, 0, 20),
    SHIELD("You just crafted a shield!", 15, 0, 20, 0, 21),
    BOW("You just crafted a bow!", 15, 0, 0, 2, 10),
    STRING("You just crafted a string", 0, 5, 0, 20, 10),
    WAGON("You made your wagon bigger!", 15, 17, 23, 7, 25);

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