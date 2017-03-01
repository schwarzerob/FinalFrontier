/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.EventControl;
import finalfrontier.model.Attack;
import finalfrontier.model.Puzzle;
import finalfrontier.model.Treasure;
import java.util.Random;

/**
 *
 * @author rschw
 */
public class EventView {
    //retrieve random integer from Location
    Random rand = new Random();
        int  n = rand.nextInt(5) + 1;
    //start event related to retrieved integer
    public boolean randomEvent(int createEvent) {
        
        switch (createEvent){
            case 1:
                this.lootTreasure();
                break;
            case 2:
                this.puzzleEvent();
                break;
            case 3:
                this.timeToAttack();
                break;
            case 4:
                this.harvestResources();
                break;
            case 5:
                this.craftItems();
                break;
        }
        return false;
    }
    //event funtion
        //
    
    private void lootTreasure() {
        EventControl.lootTreasure();
        Treasure treasure = new Treasure();
        treasure.getLoot();  
    }
    
    private void puzzleEvent() {
        EventControl.puzzelEvent();
        Puzzle puzzle = new Puzzle();
        puzzle.getDescription();  
        puzzle.getCorrectAnswer();
    }
    
    private void timeToAttack() {
        EventControl.timeToAttack();
        Attack attack = new Attack();
        attack.getHealthAttack();
        attack.getHealthPlayer();
    }
    private void timeToAttack() {
        EventControl.timeToAttack();
        Attack attack = new Attack();
        attack.getHealthAttack();
        attack.getHealthPlayer();
    }
    
    
    
    
    
    
}