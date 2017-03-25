/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

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
        System.out.println("*** The Treasure was looted ***");
    }

    public static void puzzleEvent() {
        /*
        The puzzle to be solved is retrieved Puzzle model through the EventView.
        */
        System.out.println("*** Riddle me this! ***");
    }

    public static void timeToAttack() {
        /*
        An attack with attackers strength is triggered through EventView. A menu of tools and weapons is 
        offered for defense against attack and after chosen, players and attackers heath is displayed
        */
        System.out.println("*** Pull your sword out because you are under attack! ***");
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
