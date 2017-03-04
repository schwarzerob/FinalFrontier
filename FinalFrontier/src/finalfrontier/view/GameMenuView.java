/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.control.GameControl;
import finalfrontier.model.Map;
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
            case "M":
                this.makeAMove();
                break;
            case "R":
                this.resources();
                break;
            case "C":
                this.crafting();
                break;
            case "V":
                this.viewTheMap();
                break;
            case "B":
                this.backToMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                                  +"\n    Try again");
                break;
        }
        
        return false;
    }

    private void makeAMove() {
        LocationMapView locationMapView = new LocationMapView();
        locationMapView.DisplayLocationMapView();
    }

    private void resources() {
        System.out.println("*** resources function called ***");
    }

    private void crafting() {
        System.out.println("*** crafting function called ***");
    }

    private void viewTheMap() {
        Map map = new Map();
        map.displayMap();
    }
        
    private void backToMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
}
