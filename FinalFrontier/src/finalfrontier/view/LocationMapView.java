/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

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
        value.toUpperCase();
        System.out.println("How far?");
        
        Scanner howFar = new Scanner(System.in);
        //int distance = 2;
        int distance = howFar.nextInt();
            if(distance <= 0 || distance >= 6)
                System.out.println("");
        
        switch (value){
            case "N":
                if(row+distance <= 6){
                row = row + distance;
                }else{System.out.println("\nToo far!");}
                break;
            case "S":
                if(row-distance >= 0){
                row = row - distance;
                }else{System.out.println("\nToo far!");}
                break;
            case "E":
                if(col+distance <= 5){
                col = col + distance;
                }else{System.out.println("\nToo far!");}
                break;
            case "W":
                if(col-distance >= 0){
                col = col - distance;
                }else{System.out.println("\nToo far!");}
                break;
            default:
            System.out.println("\nInvalid direction");
        }
        EventView here = new EventView();
        here.randomEvent(distance);
        
        //System.out.println(here.wasHere);
        //System.out.println(event1.event);
        Map displayMap = new Map();
        displayMap.displayMap();
        return true;
    }
}