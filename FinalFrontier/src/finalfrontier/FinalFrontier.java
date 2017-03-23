/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier;

import finalfrontier.model.Attack;
import finalfrontier.model.Player;
import finalfrontier.model.MyCharacter;
import finalfrontier.model.Craft;
import finalfrontier.model.Event;
import finalfrontier.model.Homestead;
import finalfrontier.model.Location;
import finalfrontier.model.Map;
import finalfrontier.model.Resources;
import finalfrontier.model.Treasure;
import finalfrontier.model.Puzzle;
import finalfrontier.model.ToolsAndWeapons;
import finalfrontier.model.Wagon;
import finalfrontier.control.wagonControl;
import finalfrontier.control.LocationControl;
import finalfrontier.view.StartProgramView;



/**
 *
 * @author rschw
 */
public class FinalFrontier {
   
   private Player playerName = null;
   private Player characterChoice = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
     }

    public Player getPlayerName() {
        return playerName;
    }

    public void setPlayerName(Player playerName) {
        this.playerName = playerName;
    }

    public Player getCharacterChoice() {
        return characterChoice;
    }

    public void setCharacterChoice(Player characterChoice) {
        this.characterChoice = characterChoice;
    }
       
        
}

