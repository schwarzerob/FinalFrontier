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

    public GameControl() {
    }

        public String createPlayer(String name) throws GameControlException{
            if(name == null){
                throw new GameControlException("Enter name");
            }
    
            String playerName = Player.class.getName();
            //String character = Player.class.getCharacter();
          
          return playerName;
  }

    public static void createNewGame(String player) {
        System.out.println("*** CreateNewGame function called ***");
        
    }
    public String mostItem() throws GameControlException{
        throw new GameControlException();
        //print list of resources with quantity
        
        
    }
}  
