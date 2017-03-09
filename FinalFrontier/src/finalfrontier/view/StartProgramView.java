/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.control.GameControl;
import finalfrontier.model.Player;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
    //Describe the game
    //Get the players name
    //call PlayerControl to create a player object
    //If successfull, display welcome banner
public class StartProgramView extends View{
    public StartProgramView(){
        super(
        "************************"
        + "\n * Description of the game"
        + "\n * The description fits well over many rows like this."
        + "\n************************"
        + "\n \nWhat's your name?");
    }
    
@Override
    public boolean doAction(String playersName) {
        if(playersName.length()<2){
            System.out.println("\nInvalid players name: "
                                + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        if(player == null){
            System.out.println("\nError creating player.");
            return false;
        }
        System.out.println("\n========================================="
                         + "\n Welcome" + player.getName() + ", to the Final Frontier!"
                         + "\n We hope you have a lot of fun!"
                         + "\n========================================="
                         );
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.display();
        return true;
  }
}

// stopped at start of pg 17 before the "Implement the getPlayersName() function" part
