/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.control.CharacterControl;
import finalfrontier.control.GameControl;
import finalfrontier.model.Player;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class MainMenuView extends View{
    public MainMenuView(){
        super("\n"
                   +"\n-------------------------------------"
                   +"\n|   Main Menu                       |"
                   +"\n-------------------------------------"
                   +"\nN - Start new game"
                   +"\nL - Load game"
                   +"\nH - Get help on how to play the game"
                   +"\nS - Save game"
                   +"\nQ - Quit"
                   +"\n-------------------------------------");
    }
@Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value){
            case "N":
                this.startNewGame();
                break;
            case "L":
                this.loadGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                this.console.println("\n*** Invalid selection ***"
                                  +"\n    Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        
        StartProgramView playerName = new StartProgramView();
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadGame() {
        this.console.println("*** loadGame function called ***");
    }

    private void saveGame() {
        this.console.println("*** saveGame function called ***");
        this.console.println("\n\nEnter the file path for where the game will be saved.");
        String filePath = this.getInput();
        try{
        GameControl.saveGame(FinalFrontier.getCurrentGame(), filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", displayMessage);}
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.display();
    }
    
}
