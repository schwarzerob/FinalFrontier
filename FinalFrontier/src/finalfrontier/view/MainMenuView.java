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
import finalfrontier.exceptions.MainMenuException;
import finalfrontier.model.MyCharacter;
import finalfrontier.model.Player;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                   +"\nN - New game"
                   +"\nS - Save game"
                   +"\nL - Load game"
                   +"\nH - Get help on how to play the game"
                   +"\nC - Print character reports"
                   +"\nQ - Quit"
                   +"\n-------------------------------------");
    }
@Override
    public boolean doAction(String value) {
        try {
            value = value.toUpperCase();
            switch (value){
                case "N":
                    this.startNewGame();
                    break;
                case "S":
                    this.saveGame();
                    break;
                case "L":
                    this.loadGame();
                    break;
                case "H":
                    this.displayHelpMenu();
                    break;
                case "C":
                    this.printCharReports();
                    break;
                default:
                    this.console.println("\n*** Invalid selection ***"
                            +"\n    Try again");
                    break;
            }
            return false;
        } catch (IOException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }

    private void startNewGame() {
        
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

    private void printCharReports() throws IOException {
        GameControl gameControl = new GameControl();
        gameControl.printReports();
        
    }
    
}
