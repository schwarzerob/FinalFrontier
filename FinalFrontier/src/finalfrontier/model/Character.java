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
public enum Character {
    LUMBERJACK("The lumberjack goes into the field with more wood.", 20, 10, 10, 10, 1, 10),
    FARMER("The farmer has more bags of grain.", 10, 20, 10, 10, 1, 10),
    BLACKSMITH("The blacksmith starts off with some extra ore.", 10, 10, 20, 10, 1, 10),
    HUNTER("A hunter already has plenty of sheep.", 10, 10, 10, 20, 1, 10),
    SOLDIER("The soldier already has his swords.", 10, 10, 10, 10, 3, 20),
    BANKER("The banker has all the remaining gold.", 10, 10, 10, 10, 1, 20);
    private final String description;
    private final int wood;
    private final int grain;
    private final int ore;
    private final int sheep;
    private final int swords;    
    private final int gold;
    Character(String desc,int woodAmnt, int grainAmnt, int oreAmnt, int sheepAmnt, int swordsAmnt, int goldAmnt){
        description = desc;
        wood = woodAmnt;
        grain = grainAmnt;
        ore = oreAmnt;
        sheep = sheepAmnt;
        swords = swordsAmnt;
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
    public int getSwords(){
        return swords;
    }
    public int getGold(){
        return gold;
    }
}
