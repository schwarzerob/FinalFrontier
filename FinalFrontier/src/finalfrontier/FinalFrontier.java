/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.model.Player;

/**
 *
 * @author rschw
 */
public class FinalFrontier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        playerOne.setName("Robby");
        
        String PlayerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
    }
    
}
