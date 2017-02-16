/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.model.Attack;
import finalfrontier.model.Player;
import finalfrontier.model.Character;
import finalfrontier.model.Craft;
import finalfrontier.model.Event;
import finalfrontier.model.Homestead;
import finalfrontier.model.Location;
import finalfrontier.model.Map;
import finalfrontier.model.Resources;
import finalfrontier.model.Treasure;
import finalfrontier.model.Puzzle;
import finalfrontier.model.ToolsAndWeapons;
import finalfrontier.model.Wagon;
import finalfrontier.control.wagonControl;
import finalfrontier.control.LocationControl;



/**
 *
 * @author rschw
 */
public class FinalFrontier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // new player
        Player playerOne = new Player();  // Player constructor
        playerOne.setName("Robby");
        String PlayerOneName = playerOne.getName();
        System.out.println(playerOne.toString());
        
        // players character named Hunter
        Character hunter = new Character();  // Player constructor
        hunter.setCharacterName("Hunter");
        String hunterCharacterName = hunter.getCharacterName();
        System.out.println(hunter.toString());
        
        // wagon area
        Wagon wagon = new Wagon();  // Wagon constructor
        wagon.setLength(2);
        wagon.setHeight(2);
        wagon.setWidth(2);
        System.out.println(wagon.toString());
        
        // Map
        Map mapOne = new Map(); // Map constructor
        mapOne.setColumn(6);
        mapOne.setRow(5);
        System.out.println(mapOne.toString());
        
        // Location
        Location currentLocation = new Location();
        //currentLocation.setRow(LocationControl.class.getModifiers());
        currentLocation.setRow(2);
        //currentLocation.setColumn(LocationControl.class.getModifiers());
        currentLocation.setColumn(3);
        //currentLocation.setVisited((char) LocationControl.class.getModifiers());
        currentLocation.setVisited('X');
        System.out.println(currentLocation.toString());
    
        //Attack 
        Attack attack = new Attack();
        attack.setHealthAttack(30);
        attack.setHealthPlayer(30);
        attack.setHealthAttack(3);
        attack.setHealthPlayer(3);
        System.out.println(attack.toString());
        
        //Craft
        Craft crafting = new Craft();
        crafting.setNeededResources(50);
        crafting.setCreate("Sword Crafted");
        crafting.setAmountRequired(13);
        System.out.println(crafting.toString());
        
        //resources
        Resources resources = new Resources();
        resources.setType("Wood");
        resources.setQuantity(0);
        System.out.print(resources.toString());
        
        //event
        Event event = new Event();
        event.setBlockedLocation("There is a Canyon ahead,  Build a Bridge");
        event.setDescription("Welcome to The Hunting Grounds");
        event.setSymbol("~~XC~~");
        System.out.print(event.toString());
        
        //treasure
        Treasure treasure = new Treasure();
        treasure.setLoot(50);
        System.out.print(treasure.toString());
        
        // Tools and Weapons
        ToolsAndWeapons bow = new ToolsAndWeapons();
        bow.setType('A');
        System.out.println(bow.toString());
        
        //Puzzle
        Puzzle door = new Puzzle();
        door.setDescription("At the door to the dragons cave!");
        door.setCorrectAnswer("Yet to be determined");
        System.out.println(door.toString());
        
        //Homestead
        Homestead rexburg = new Homestead();
        rexburg.setDescription("Welcome to Rexburg!");
        rexburg.setPurchaseResource("Wood");
        rexburg.setSellResource("Grain");
        System.out.println(rexburg.toString());
        
        
        
        
        
        
        
        
     }
         
        
}

