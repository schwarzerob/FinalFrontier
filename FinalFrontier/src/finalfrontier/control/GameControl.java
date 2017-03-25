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

    public String createPlayer(String name){
        if(name == null){
            System.out.println("Enter a name");
        }

        String playerName = Player.class.getName();
        return playerName;
    }

    public static void createNewGame(String player) {
        System.out.println("*** CreateNewGame function called ***");
        
    }
    public static void saveGame(String player) {
        System.out.println("*** saveGame function called ***");
        
    }
    public static void resumeGame(String player) {
        System.out.println("*** resumeGame function called ***");
        
    }
    public String sacedGames(){
        //print list of resources with quantity
        return null;
    }
}  
