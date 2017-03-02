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
public class LocationMapView {
    public LocationMapView() {
    }
        private String direction;
        public static int row = 0;
        public static int col = 0;
        private int howFar;
        
        //changes from current location coordinates
    
    //display map
    public String showMap(){
    
        //print Map
        Map displayMap = new Map();
        displayMap.displayMap();
        return "";
        //each row is an individual row in mapMatrix[][]
        //specific character for each event at visited location placed on map location.
        
    }
    
    //get coordinates for destination
    public int whereToGo(){
        
            
            System.out.println("\nWhich way?" + 
                                "\n   N "+
                                "\n  W+E"+
                                "\n   S ");
            
            
            //I can't figure out the only error. "No line found"  ***********************
            Scanner whichWay = new Scanner(System.in);
            direction = whichWay.nextLine();
            direction = direction.toUpperCase();
            
            
            
            if(direction!="N"||direction!="S"||direction!="E"||direction!="W"){
                this.doAction();
                System.out.println("\nNot a valid direction");
                System.out.println("\n N, S, E, or W");
                direction = "A";
                }

            while(direction.length() != 1){
                System.out.println("\nHow Far are we going?");
            
                Scanner keyPad = new Scanner(System.in);
                howFar = keyPad.nextInt();
                if(direction == "N" && row-howFar > 6){
                    row = row - howFar;
                    }
                else if(direction == "S" && row+howFar < 0){
                    row = row - howFar;
                        }
                else if(direction == "E" && col+howFar < 5){
                    col = col + howFar;
                        }
                else if(direction == "W" && col-howFar > 0){
                    col = col - howFar;
                        }
                else 
                    System.out.println("\nToo far!");
            }
        return 0;
    }
    
        //run Location with new row, col, and howFar
    public boolean doAction(){
        
        return false;
    }
    
    //return to MainMenuView
    private void BackToMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }




}
