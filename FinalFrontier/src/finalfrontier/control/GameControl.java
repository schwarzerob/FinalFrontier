/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.FinalFrontier;
import finalfrontier.exceptions.GameControlException;
import finalfrontier.model.Game;
import finalfrontier.model.Player;
import finalfrontier.view.LocationMapView;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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

    public static void saveGame(Game game, String filePath) 
            throws GameControlException{
        System.out.println("*** SaveGame function called ***");
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);
        }catch(Exception ex){
            throw new GameControlException(ex.getMessage());
        }
        
    }
    public String mostItem() throws GameControlException{
        throw new GameControlException();
        //print list of resources with quantity
        
    }
    public static void resumeGame(String player) {
        System.out.println("*** resumeGame function called ***");
        
    }
    public String savedGames(){
        //print list of resources with quantity
        return null;
    }
}  
