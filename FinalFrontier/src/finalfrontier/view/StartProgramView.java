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
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "Please enter you name";
        //display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "************************"
        + "\n * Description of the game"
        + "\n * It fits well over many rows like this."
        + "\n************************"
        );
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
        this.displayNextView(player);
        return true;
  }
    
    
    
    
    /**
     * display the start program view
     */

    private void displayNextView(Player player) {
        System.out.println("\n========================================="
                         + "\n Welcome to the game " + player.getName()
                         + "\n We hope you have a lot of fun!"
                         + "\n========================================="
                         );
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.display();
    }
    
}

// stopped at start of pg 17 before the "Implement the getPlayersName() function" part
