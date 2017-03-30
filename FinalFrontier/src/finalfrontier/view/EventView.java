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
public class EventView extends View{
        public char wasHere = 'X';
        int event;

    public EventView() {
    }
    //retrieve random integer from Location
    

    //start event related to retrieved integer
    public boolean randomEvent(int createEvent) {
            Location destination = new Location();
            event = destination.getEvent();
            EventControl eventControl = new EventControl();
        switch (event){
            case 1:
                eventControl.lootTreasure();
                this.console.println("Treasure chest!");
                wasHere = '$';
                break;
            case 2:
                eventControl.puzzleEvent();
                this.console.println("Solve the puzzle!");
                wasHere = '?';
                break;
            case 3:
                eventControl.timeToAttack();
                this.console.println("Attack!");
                wasHere = 'ƚ';
                break;
            case 5:
                eventControl.theDragon();
                this.console.println("Oh no! It's the Dragon!");
                wasHere = '§';
                break;
            default:
                this.console.println("Nothing here!");
                wasHere = 'Ø';
                break;
        }
            this.console.println("Random number: "+event);
        this.console.println("Event character: "+wasHere);
        return false;
    }
    
    public char getWasHere(){
        return wasHere;
    }

    @Override
    public boolean doAction(String value) {
        this.console.println("doAction function");
            return false;
    }
   
    
    
    
    
    
    
}
