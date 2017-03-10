/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.model.Map;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class LocationMapView extends View{
        //private final String howFar;  //Banner
        public static int row=0;
        public static int col=0;
        
    public LocationMapView() {
        super("\nWhich way?" + 
                                "\n    N "+
                                "\n   W+E"+
                                "\n    S "+
                                "\nQ-Quit moving");
        //this.howFar = ("\nHow Far are we going?");
    }
        //run Location with new row, col, and howFar
    @Override
    public boolean doAction(String direction){
            direction.toUpperCase();
        //    if(direction=="N" && 
        //       direction=="S" && 
        //       direction=="E" && 
        //       direction=="W"){
        //        System.out.println("\n"+ direction + " is not a valid direction"
        //                            + "\nEnter N, S, E, or W\n");
        //        return false;
        //    }else{
        //        System.out.println("How far?");
        //        }
            System.out.println("How far?");
            
            Scanner howFar = new Scanner(System.in);
            int distance = howFar.nextInt();
                if(distance <= 0 || distance >= 6)
                    System.out.println("");
            
            switch (direction){
                case "N":
                    if(row+distance < 6){
                    row = row + distance;
                    }
                    break;
                case "S":
                    if(row-distance > 0){
                    row = row - distance;
                    }
                    break;
                case "E":
                    if(col+distance < 5){
                    col = col + distance;
                    }
                    break;
                case "W":
                    if(col-distance > 0){
                    col = col - distance;
                    }
                    break;
                default:
                System.out.println("\nInvalid direction");
            }
            
            System.out.println("row=" + row +"   col="+col);
        
            Map displayMap = new Map();
            displayMap.displayMap();
            return false;
    }
}