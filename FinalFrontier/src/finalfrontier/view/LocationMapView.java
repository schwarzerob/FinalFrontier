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
        //variables:
        public int row = 6;
        public int col = 0;
        public int far = 0;
        String direction = "";
        int howFar = 0;
        
        //changes from current location coordinates
    
    //display map
    public String showMap(){
    
        //print Map
        Map displayMap = new Map();
        displayMap.displayMap();
        return null;
        //each row is an individual row in mapMatrix[7][5]
        //specific character for each event at visited location placed on map location.
        
    }
    
    //get coordinates for destination
    public String whereToGo(){
        while(direction!="N"||direction!="S"||direction!="E"||direction!="W"){    
            System.out.println("\nWhich way?");  
            System.out.println(" N ");  
            System.out.println("W+E");  
            System.out.println(" S ");
            Scanner keyboard = new Scanner(System.in);
            direction = keyboard.nextLine();
                System.out.println("\nNot a valid direction");
                System.out.println("N, S, E, or W");
        }

            while(direction.length() != 1){
            System.out.println("\nHow Far?");
            
            Scanner keyPad = new Scanner(System.in);
            howFar = keyPad.nextInt();
            if(direction == "N"){
                row = row - howFar;
                if (row <= 0)
                    System.out.println("Too far!");
                    }
            else if(direction == "S"){
                row = row - howFar;
                if (row >= 5)
                    System.out.println("Too far!");
                    }
            else if(direction == "E"){
                col = col + howFar;
                if (col <= 0)
                    System.out.println("Too far!");
                    }
            else if(direction == "W"){
                col = col - howFar;
                if (col >= 5)
                    System.out.println("Too far!");
                    }
            else 
                System.out.println("\nInvalid input");
            }
        //row = Scanner input of direction if N or S
        //col = Scanner input of direction if E or W
        //far = Scanner input of distance row/column + far
            return null;
    }
    
        //run Location with new row, col, and far
    public boolean doAction(){
        
        return false;
    }
    
    //return to MainMenuView
    private void BackToMainMenu(){
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
}
