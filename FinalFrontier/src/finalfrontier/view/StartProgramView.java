/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.control.CharacterControl;
import finalfrontier.control.GameControl;
import finalfrontier.exceptions.GameControlException;
import finalfrontier.model.MyCharacter;
import finalfrontier.model.Player;
import finalfrontier.model.Resources;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rschw
 */
    //Describe the game
    //Get the players name
    //call PlayerControl to create a player object
    //If successfull, display welcome banner
public class StartProgramView extends View{
    String player;
    public StartProgramView(){
        super(
        " ************************"
        + "\n * Description of the game"
        + "\n * The description fits well over many rows like this."
        + "\n ************************"
        + "\n \nWhat's your name?");
    }
    
    
@Override
    public boolean doAction(String playersName) {
        player=playersName;
        if(playersName.length()<2){
            System.out.println("\nInvalid players name: "
                                + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        
        playersName = Player.class.getName();
        if(playersName == null){
            System.out.println("\nError creating player.");
            return false;
        }
        CharacterView charView =new CharacterView();
        charView.display();
        System.out.println("\n========================================="
                         + "\n Welcome " + player + ", to the Final Frontier!"
                         + "\n We hope you have a lot of fun as the " + CharacterControl.characterName
                         + "\n========================================="
                         );
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.display();
        return true;
  }
}
