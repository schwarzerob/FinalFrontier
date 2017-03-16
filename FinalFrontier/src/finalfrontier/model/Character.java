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
    Banker("has extra gold", 10, 10, 10, 10, 1, 20);
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
}
