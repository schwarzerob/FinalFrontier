/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.model.Player;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n*** createPlayer() funcion called ***");
        return new Player();
    }
    public String NewGame(){
        
        /* Very Beginning
        ‘N’ -New Game
        ‘C’ -Continue Game
        ‘L’ -Load Game
        ‘S’ -Save Game
        ‘H’ -Help
        ‘E’ -Exit Game
        */
        Scanner doWhat = new Scanner(System.in);
        char firstChoice = doWhat.next().charAt(0);
        switch (firstChoice){
            case 'n':
            case 'N':
                //New Game
                break;
            case 'c':
            case 'C':
                //Continue game currently playing
                break;
            case 'l':
            case 'L':
                //Load past game
                break;
            case 's':
            case 'S':
                //Save game
                break;
            case 'h':
            case 'H':
                //Help list
                break;
            case 'e':
            case 'E':
                //Exit game
                break;
            default: 
            System.out.println("Invalid input.");
            break;            
        }
        
        
        /* The start of each round
        ‘G’ -Go
        ‘C’ -Craft
        ‘I’ -Inventory
            Show list of resources, and to craft the weapons and tools needed.
        ‘V’ View the map
            ‘B’ -go back
            Player sees the map and their location on it.
        */
        firstChoice = doWhat.next().charAt(0);
        switch (firstChoice){
            case 'g':
            case 'G':
                //Go again
                //LocationControl
                break;
            case 'c':
            case 'C':
                //Craft items
                //CraftingControl
                break;
            case 'i':
            case 'I':
                //Inventory list
                //
                break;
            case 'v':
            case 'V':
                //View the map
                //MapControl
                break;
            default: 
            System.out.println("Invalid input.");
            break;            
        }
        
    return null;
        }
}
