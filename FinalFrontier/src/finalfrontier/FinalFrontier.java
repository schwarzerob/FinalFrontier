/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.model.Attack;
import finalfrontier.model.Player;
import finalfrontier.model.Character;
import finalfrontier.model.Location;
import finalfrontier.model.Map;
import finalfrontier.model.Wagon;

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
        currentLocation.setColumn(2);
        currentLocation.setRow(4);
        currentLocation.getVisited('X');
        System.out.println(currentLocation.toString());
        
    }
    //Attack 
        Attack attack = new Attack();
        attack.sethealthAttack(3);
        attack.sethealthPlayer(3);
        System.out.println(attack.toString());
        
}
