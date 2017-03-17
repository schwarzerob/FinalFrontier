/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;
/**
 *
 * @author Gabriel
 */
public enum Event  {
    Attack("You need to defend, this location is infested with goblins"),
    EmptyLand("You are out of luck, there is nothing here"),
    LootTreasure("You found some extra resources!");
    private final String description;
   
    Event(String desc){
        description = desc;
        
    }
public String getDescription(){
        return description;
    }
}

