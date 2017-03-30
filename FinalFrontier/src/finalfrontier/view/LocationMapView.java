/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.LocationControl;
import finalfrontier.exceptions.LocationControlExceptions;
import finalfrontier.model.Location;
import finalfrontier.model.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rschw
 */
public class LocationMapView extends View{
    
        public static int row=0;
        public static int col=0;
        
    public LocationMapView() {
        super("\nWhich way?" + 
                                "\n    N "+
                                "\n   W+E"+
                                "\n    S "+
                                "\nQ-Quit moving");
    }
    
    @Override
    public boolean doAction(String value){
            try {
                value.toUpperCase();
                System.out.println("How far?");
                int distance =0;
                if(distance <= 0 || distance >= 6)
                    System.out.println("");
                
                switch (value){
                    case "N":
                        LocationControl.goNorth(distance, row);
                        break;
                    case "S":
                        LocationControl.goSouth(distance, row);
                        break;
                    case "E":
                        LocationControl.goEast(distance, col);
                        break;
                    case "W":
                        LocationControl.goWest(distance, col);
                        break;
                    case "Q":
                        GameMenuView gameMenu = new GameMenuView();
                        gameMenu.display();
                        break;
                    default:
                }
                EventView here = new EventView();
                here.randomEvent(distance);
            } catch (LocationControlExceptions ex) {
                System.out.println("Error. Invalid direction.");
            }
            return false;
    }
}