/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.control.GameControl;
import finalfrontier.exceptions.GameControlException;
import finalfrontier.model.MyCharacter;
import finalfrontier.model.Player;
import finalfrontier.model.Resources;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        " ************************"
        + "\n * Description of the game"
        + "\n * The description fits well over many rows like this."
        + "\n ************************"
        + "\n \nWhat's your name?");
    }
    String player="me";
    
    
@Override
    public boolean doAction(String playersName) {
        playersName="me";
        if(playersName.length()<2){
            System.out.println("\nInvalid players name: "
                                + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        
        player = Player.class.getName();
        if(player == null){
            System.out.println("\nError creating player.");
            return false;
        }
        getCharacter();
        return true;
    }
        
    public String getCharacter(){
        MyCharacter charNames[] = MyCharacter.values(); //create Array from MyCharacter enum
        //Which character?
        displayMessage=("\n ************************"
                       + "\n * Which character do you want to play?"
                       + "\n * Here is a list of characters and their bonuses."
                       + "\n ************************");
        for(int i=0; i<charNames.length; i++){
            System.out.println("Character "+i+": "+charNames[i]);
            System.out.println("    Wood:  "+charNames[i].getWood()+",  Grain: "+charNames[i].getGrain()+",  Ore: "+charNames[i].getOre()
                            +"\n    Sheep: "+charNames[i].getSheep()+",  Swords: "+charNames[i].getSwords()+",  Gold: "+charNames[i].getGold());
        }
        
        int value=0;
        do{
        getInput();
        try{
        value=Integer.parseInt(getInput());
        }catch(NumberFormatException nf){
            System.out.println("Not a number");
        }
        } while (value <0 || value >= charNames.length);
        System.out.println("\n========================================="
                         + "\n Welcome " + player + ", to the Final Frontier!"
                         + "\n We hope you have a lot of fun as the "+charNames[value]
                         + "\n========================================="
                         );
        Resources.wood=charNames[value].getWood();
        Resources.grain=charNames[value].getGrain();
        Resources.ore=charNames[value].getOre();
        Resources.sheep=charNames[value].getSheep();
        Resources.swords=charNames[value].getSwords();
        Resources.gold=charNames[value].getGold();
    MainMenuView mainMenu = new MainMenuView();
    mainMenu.display();
        return null;
  }
}
