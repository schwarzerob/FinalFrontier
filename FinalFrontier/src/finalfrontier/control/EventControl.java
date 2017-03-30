/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.model.Attack;
import finalfrontier.model.Dragon;
import finalfrontier.model.Puzzle;
import finalfrontier.model.Treasure;

/**
 *
 * @author rschw
 */
public class EventControl {

    public static void lootTreasure(){
        Treasure treasure = new Treasure();
        treasure.getLoot();
        /*
        The type and amount of the resource to be gathered is from the EventView triggered Treasure model, and then applied to individual amounts in Resources model.
        */
    }

    public static void puzzleEvent() {
        Puzzle puzzle = new Puzzle();
        puzzle.getDescription();  
        puzzle.getCorrectAnswer();
        /*
        The puzzle to be solved is retrieved Puzzle model through the EventView.
        */
    }

    public static void timeToAttack() {
        Attack attack = new Attack();
        attack.getHealthAttack();
        attack.getHealthPlayer();
        /*
        An attack with attackers strength is triggered through EventView. A menu of tools and weapons is 
        offered for defense against attack and after chosen, players and attackers heath is displayed
        */
    }

    public static void theDragon() {
        Dragon dragon = new Dragon();
        dragon.getHealthAttack();
        dragon.getHealthPlayer();
        /*
        An attack with attackers strength is triggered through EventView. A menu of tools and weapons is 
        offered for defense against attack and after chosen, players and attackers heath is displayed
        */
    }

    public static void harvestResources() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void craftItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String Event(char symbol, String description){
        
        //get location from Location
        //execute event assigned to that location
        
        return null;        
    }    
}
