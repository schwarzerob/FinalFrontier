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
public class GameMenuView extends View{
    String displayMessage = "What to do now?";
    public GameMenuView(){
        super("\n"
                   +"\n-------------------------------------"
                   +"\n|   Game Menu                       |"
                   +"\n-------------------------------------"
                   +"\nM - Move locations"
                   +"\nR - See your resource stash"
                   +"\nC - Craft objects"
                   +"\nV - View the map"
                   +"\nB - Back to the main menu"
                   +"\n-------------------------------------");
    }

    public boolean doAction(String value) {
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
        locationMapView.display();
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
        mainMenuView.display();
    }
    
}
