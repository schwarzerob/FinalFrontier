/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.LocationControl;
import finalfrontier.exceptions.LocationControlExceptions;
import java.io.IOException;

/**
 *
 * @author rschw
 */
public class LocationMapView extends View{
    
        
    public LocationMapView() {
        super("\nWhich way?" + 
                                "\n    N "+
                                "\n   W+E"+
                                "\n    S "+
                                "\nQ-Quit moving");
    }
    
    @Override
    public boolean doAction(String value){
        int distance=0;
        LocationControl locationControl = new LocationControl();
        String direction=value.toUpperCase();
        try {
            this.console.println("How far?");

            try {
                value = this.keyboard.readLine();
                distance = Integer.parseInt(value);
                if(distance <= 0 || distance >= 6){
                    this.console.println("****You must enter a proper value****");
                    
                }
                EventView here = new EventView();
                here.randomEvent(distance);
            } catch (IOException ex) {
                this.console.print(ex.getMessage());
            }

            switch (direction){
                case "N":
                    //map.setRow(row);
                    locationControl.goNorth(distance);
                    
                    break;
                case "S":
                    //map.setRow(row);
                    locationControl.goSouth(distance);
                    break;
                case "E":
                    //map.setColumn(col);
                    locationControl.goEast(distance);
                    break;
                case "W":
                    //map.setColumn(col);
                    locationControl.goWest(distance);
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
            this.console.println(ex.getMessage());
        }
        return false;
    }
}
