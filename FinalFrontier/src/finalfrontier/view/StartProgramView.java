/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.CharacterControl;
import finalfrontier.model.Player;

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
            this.console.println("\nInvalid players name: "
                                + "The name must be greater than one character in length");
            return false;
        }
        this.console.println(player);
        // call createPlayer() control function
        
        playersName = Player.class.getName();
        if(playersName == null){
            this.console.println("\nError creating player.");
            return false;
        }
        
        CharacterView charView =new CharacterView();
        charView.display();
        String charName = CharacterControl.characterName;
        this.console.println("\n========================================="
                         + "\n Welcome " + player + ", to the Final Frontier!"
                         + "\n We hope you have a lot of fun as the " + charName
                         + "\n========================================="
                         );
        Player players = new Player(player, charName);
        players.setName(player);
        players.setCharacter(charName);
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.display();
        return true;
  }
}
