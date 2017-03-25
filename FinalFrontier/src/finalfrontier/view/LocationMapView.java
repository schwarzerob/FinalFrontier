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
        try{
        value.toUpperCase();
        System.out.println("How far?");
        Scanner keyboard = new Scanner(System.in);
        int distance = keyboard.nextInt();
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
            default:
        }
        EventView here = new EventView();
        here.randomEvent(distance);
        //System.out.println(here.wasHere);
        //System.out.println(event1.event);
        }catch(LocationControlExceptions){
            
        }
        return true;
    }
}