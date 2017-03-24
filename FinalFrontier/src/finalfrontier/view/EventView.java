/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.EventControl;
import finalfrontier.model.Attack;
import finalfrontier.model.Dragon;
import finalfrontier.model.Location;
import finalfrontier.model.Puzzle;
import finalfrontier.model.Treasure;
import java.util.Random;

/**
 *
 * @author rschw
 */
public class EventView {
        public char wasHere = 'X';
        int event;

    public EventView() {
    }
    //retrieve random integer from Location
    

    //start event related to retrieved integer
    public boolean randomEvent(int createEvent) {
            Location destination = new Location();
            event = destination.getEvent();
        switch (event){
            case 1:
                EventControl.lootTreasure();
                System.out.println("Treasure chest!");
                wasHere = '$';
                break;
            case 2:
                this.puzzleEvent();
                System.out.println("Solve the puzzle!");
                wasHere = '?';
                break;
            case 3:
                this.timeToAttack();
                System.out.println("Attack!");
                wasHere = 'ƚ';
                break;
            case 5:
                this.theDragon();
                System.out.println("Oh no! It's the Dragon!");
                wasHere = '§';
                break;
            default:
                System.out.println("Nothing here!");
                wasHere = 'Ø';
                break;
        }
            System.out.println("Random number: "+event);
        System.out.println("Event character: "+wasHere);
        return false;
    }
    
    public char getWasHere(){
        return wasHere;
    }
    //event funtion
    //
    
    private void lootTreasure() {
        EventControl.lootTreasure();
        Treasure treasure = new Treasure();
        treasure.getLoot();  
    }
    
    private void puzzleEvent() {
        EventControl.puzzleEvent();
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
    
    private void theDragon() {
        EventControl.timeToAttack();
        Dragon dragon = new Dragon();
        dragon.getHealthAttack();
        dragon.getHealthPlayer();
    }
   
    
    
    
    
    
    
}
