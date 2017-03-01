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
    public int whereToGo(){
        
        //variables:
        int row = 6;
        int col = 0;
        String direction = "";
        int howFar = 0;
        
        while(direction!="N"||direction!="S"||direction!="E"||direction!="W"){    
            System.out.println("\nWhich way?\n");  
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
            if(direction == "N" && row-howFar <= 5){
                row = row - howFar;
                    }
            else if(direction == "S" && row+howFar >= 0){
                row = row - howFar;
                    }
            else if(direction == "E" && col+howFar <= 5){
                col = col + howFar;
                    }
            else if(direction == "W" && col-howFar >= 0){
                col = col - howFar;
                    }
            else 
                System.out.println("\nToo far!");
            }
        //row = Scanner input of direction if N or S
        //col = Scanner input of direction if E or W
        //far = Scanner input of distance row/column + far
        return 0;
            
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
