/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class GameMenuView {
        private final String menu;
        public String value;
        private String promptMessage;
    public GameMenuView(){
        this.menu = "\n"
                   +"\n-------------------------------------"
                   +"\n|   Game Menu                       |"
                   +"\n-------------------------------------"
                   +"\nM - Move locations"
                   +"\nR - See your resource stash"
                   +"\nC - Craft objects"
                   +"\nV - View the map"
                   +"\nB - Back to the main menu"
                   +"\n-------------------------------------";
    }

public void displayGameMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        this.promptMessage = "What to do now?";
        value = "";
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        while (!valid){
            System.out.println("\n"+this.menu);
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

    public boolean doAction(String menuOption) {
        value = value.toUpperCase();
        switch (value){
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                                  +"\n    Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(FinalFrontier.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** StartExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }
    
}
