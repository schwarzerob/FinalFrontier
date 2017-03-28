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
    LUMBERJACK("Lumberjack begins with more wood than the others.", 10, 5, 5, 5, 1, 5, 5, 1),
    FARMER("Farmer leaves with extra grain for the trip.", 5, 10, 5, 5, 1, 5, 5, 1),
    BLACKSMITH("the Blacksmith has more ore for the crafting.", 5, 5, 10, 5, 1, 2, 5, 1),
    HUNTER("Hunters already have extra food when he leaves.", 5, 5, 5, 10, 1, 5, 5, 1),
    SOLDIER("a Soldier has more battle equipment to start with.", 5, 5, 5, 5, 3, 5, 10, 1),
    CACHIER("Cashier from the bank, well of course, he's already got extra cash in his pocket.", 5, 5, 5, 5, 1, 10, 5, 1);
    private final String description;
    private final int wood;
    private final int grain;
    private final int ore;
    private final int sheep;
    private final int swords;    
    private final int gold;
    private final int health;
    private final int battle;
    
    //Constructor
    MyCharacter(String desc,int woodAmnt, int grainAmnt, int oreAmnt, int sheepAmnt, int swordsAmnt, int goldAmnt, int healthAmnt, int battleAmnt){
        this.description = desc;
        this.wood = woodAmnt;
        this.grain = grainAmnt;
        this.ore = oreAmnt;
        this.sheep = sheepAmnt;
        this.swords = swordsAmnt;
        this.gold = goldAmnt;
        this.health = healthAmnt;
        this.battle = battleAmnt;
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
    public int getHealth(){
        return this.health;
    }
    public int getShields(){
        return this.battle;
    }
}
