/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class HelpMenuView {
        private final String menu;
        public String value;
    private String promptMessage;
    public HelpMenuView(){
        this.menu = "\n"
                   +"\n--------------------------------------"
                   +"\n|   Getting Help                     |"
                   +"\n--------------------------------------"
                   +"\nG - What is the goal of the game?"
                   +"\nM - How to move"
                   +"\nE - Estimating the amount of resources"
                   +"\nH - Harvesting resources"
                   +"\nC - Crafting materials with resources"
                   +"\nQ - Quit"
                   +"\n--------------------------------------";
    }

public void displayHelpMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
        this.promptMessage = "Please enter you choice from the menu";
        //String value = "";
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
            case "G":
                this.goalOfGame();
                break;
            case "M":
                this.howToMove();
                break;
            case "E":
                this.resourceAmount();
                break;
            case "H":
                this.harvestResources();
                break;
            case "C":
                this.craftItems();
                break;
            case "Q":
                this.quit();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                                  +"\n    Try again");
                break;
        }
        return false;
    }

    private void goalOfGame() {
        System.out.println("*** The goal of the game is to find the Dragon and kill him. "
                + "\n In order to do this you will have to go through a map full of challenges" 
                + "\n and craft your own equipment to become more powerful ***");
        
        
    }

    private void howToMove() {
        System.out.println("*** Moving is one of the basic thing you should learn in this game." 
                + "/n there are 4 direction where you can move; North, East, West, and South.  ***");
    }

    private void resourceAmount() {
        System.out.println("*** In order to craft and create items youll need a specific amount of reasources" 
                + "/n depending on what you are crafting or and how big is the item ***");
    }

    private void harvestResources() {
        System.out.println("*** Some areas in the map will give you the option to harvest special resourcess to craft special items. ***");
    }

    private void craftItems() {
        System.out.println("*** One of the biggest parts in the game is the ability to craft items." + 
                "Items will help you during your adventure and make you powerful ***");
    }

    private void quit() {
        System.out.println("*** This will end the game ***");
    }
    
}
