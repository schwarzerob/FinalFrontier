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
public enum MyCharacter {
    LUMBERJACK("The lumberjack goes into the field with more wood.", 30, 20, 20, 20, 1, 20),
    FARMER("The farmer has more bags of grain.", 20, 30, 20, 20, 1, 20),
    BLACKSMITH("The blacksmith starts off with some extra ore.", 20, 20, 30, 20, 1, 20),
    HUNTER("A hunter already has a large herd of sheep.", 20, 20, 20, 30, 1, 20),
    SOLDIER("The soldier already has his swords.", 20, 20, 20, 20, 3, 20),
    BANKER("The banker has all the remaining gold.", 20, 20, 20, 20, 1, 30);
    private final String description;
    private final int wood;
    private final int grain;
    private final int ore;
    private final int sheep;
    private final int swords;    
    private final int gold;
    
    //Constructor
    MyCharacter(String desc,int woodAmnt, int grainAmnt, int oreAmnt, int sheepAmnt, int swordsAmnt, int goldAmnt){
        this.description = desc;
        this.wood = woodAmnt;
        this.grain = grainAmnt;
        this.ore = oreAmnt;
        this.sheep = sheepAmnt;
        this.swords = swordsAmnt;
        this.gold = goldAmnt;
    }
    
    //Getters
    public String getDescription(){
        return this.description;
    }
    public int getWood(){
        return this.wood;
    }
    public int getGrain(){
        return this.grain;
    }
    public int getOre(){
        return this.ore;
    }
    public int getSheep(){
        return this.sheep;
    }
    public int getSwords(){
        return this.swords;
    }
    public int getGold(){
        return this.gold;
    }
}
