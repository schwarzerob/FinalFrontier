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
public class StartProgramView {
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

    public void displayStartProgramView() {
        boolean done = false; // set flag to not done
        do{
            //Prompt for and get the input value
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            //do requested action and display the next view
            done = this.doAction(playersName);
        }while (!done);
        
    }

    private String getPlayersName() {
     
        
        //Template from pg.18
        
        String value = "";
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        while (!valid){
            System.out.println("\n"+this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            if(value.length() < 1){
                System.out.println("Invalid value: The value cannot be blank");
                continue;
            }
            break;
        }
        return value;        
    }

    private boolean doAction(String playersName) {
        if(playersName.length()<2){
            System.out.println("\nInvalid players name: "
                                + "The name must be greater than one character in length");
            return false;
        }
        // call creatPlayer() control function
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
public void diplayStartProgramView(){

    boolean done = false; //set flag to not done
do {
//promt for and get player name 
String playersName = this.getPlayerName();
if (playersName.toUpperCase().equals("Q")) //user want to quit
    return; //exit game

    //do the requested action and display the next view
    done = this.doAction(playersName);

} while (!done);
}

    private String getPlayerName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
