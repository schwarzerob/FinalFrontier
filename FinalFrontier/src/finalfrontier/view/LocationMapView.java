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
import java.io.IOException;
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
        int distance;
        String direction=value;
            try {
                direction.toUpperCase();
                this.console.println("How far?");
                value = this.keyboard.readLine();
                distance = Integer.parseInt(value);
                if(distance <= 0 || distance >= 6){
                    this.console.println("****You must enter a proper value****");
                    
                }
                
                switch (direction){
                    case "N":
                        LocationControl.setRow(row);
                        Map.setRow(row);
                        LocationControl.goNorth(distance, row);
                        break;
                    case "S":
                        LocationControl.setRow(row);
                        Map.setRow(row);
                        LocationControl.goSouth(distance, row);
                        break;
                    case "E":
                        LocationControl.setCol(col);
                        Map.setColumn(col);
                        LocationControl.goEast(distance, col);
                        break;
                    case "W":
                        LocationControl.setCol(col);
                        Map.setColumn(col);
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
                ErrorView.display(this.getClass().getName(),"Error: Invalid direction.");
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"Error: Invalid distance.");
            }
        return false;
    }

    public static int getRow() {
        return row;
    }

    public static void setRow(int row) {
        LocationMapView.row = row;
    }

    public static int getCol() {
        return col;
    }

    public static void setCol(int col) {
        LocationMapView.col = col;
    }
}