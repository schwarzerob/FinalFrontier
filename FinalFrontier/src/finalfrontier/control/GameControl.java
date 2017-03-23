/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.FinalFrontier;
import finalfrontier.exceptions.GameControlException;
import finalfrontier.model.Player;
import finalfrontier.view.LocationMapView;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class GameControl {

        public Player createPlayer(String name) throws GameControlException {
            if(name == null){
              throw new GameControlException("Not a Valid Name");
            }
    
            Player player = new Player(name);
            player.setName(name);
          
            FinalFrontier.setPlayer(player); //save the player
          
          return player;
  }

    public static void createNewGame(Player player) {
        System.out.println("*** CreateNewGame function called ***");
        
    }
    public String mostItem(){
        //print list of resources with quantity
        
        return null;
    }
}  
