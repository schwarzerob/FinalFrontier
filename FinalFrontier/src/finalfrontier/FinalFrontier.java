/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.model.Player;
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
        
        // wagon area
        Wagon wagon = new Wagon();  // Wagon constructor
        wagon.setLength(2);
        int wagonLength = wagon.getLength();
        wagon.setHeight(2);
        int wagonHeight = wagon.getHeight();
        wagon.setWidth(2);
        int wagonWidth = wagon.getWidth();
        System.out.println(wagon.toString());
    }
    
}
