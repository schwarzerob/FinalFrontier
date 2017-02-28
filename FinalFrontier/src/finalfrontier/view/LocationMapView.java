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
        int row = 0;
        int col = 0;
        int far = 0;
        //save Location specs to array
        int mapMatrix[][] = {                
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0}
        };
        
        //changes from current location coordinates
    public LocationMapView() {
}
    
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
        
            System.out.println("Which way? N, S, E, or W");
            String direction = "";
            Scanner keyboard = new Scanner(System.in);
            direction = keyboard.nextLine();
            System.out.println("Which way? N, S, E, or W");
            int howFar = 0;
            Scanner keyPad = new Scanner(System.in);
            howFar = keyPad.nextInt();
            if(direction.length() != 1){
                System.out.println("Invalid input");}
            
            if(direction == "N")
                row = row + howFar;
            else if(direction == "S")
                row = row - howFar;
            else if(direction == "E")
                col = col + howFar;
            else if(direction == "W")
                col = col - howFar;
            else 
                System.out.println("Invalid input");
        return direction;        
        //row = Scanner input of direction if N or S
        //col = Scanner input of direction if E or W
        //far = Scanner input of distance row/column + far
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
