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
        private final String where;   //Banner
        private final String howFar;  //Banner
        public static int row = 0;
        public static int col = 0;
        private String direction;
        
    public LocationMapView() {
        this.where = ("\nWhich way?" + 
                                "\n   N "+
                                "\n  W+E"+
                                "\n   S ");
        this.howFar = ("\nHow Far are we going?");
    }
    
    
    public void DisplayLocationMapView(){
    boolean done= false;
        do {
        String whichWay = this.whereToGo();
        int distance = this.howFarToGo();
        this.doAction(whichWay, distance);
        }while(!done);
    Map displayMap = new Map();
    displayMap.displayMap();
    }
    
    //get coordinates for destination
    private String whereToGo(){
        System.out.println(where);
        direction = "";
        Scanner keyboard = new Scanner(System.in);
        boolean done = false;
        while(!done){
            this.direction = keyboard.nextLine().toUpperCase();
            if(direction!="N"&&direction!="S"&&direction!="E"&&direction!="W"){
                System.out.println("\n"+ direction + " is not a valid direction");
                System.out.println("\n N, S, E, or W");
                continue;
                }
            break;
        }
        return direction;
    }
    private int howFarToGo(){
        System.out.println(howFar);
        Scanner howFar = new Scanner(System.in);
        int distance = howFar.nextInt();
            return distance;
            
    }
    
    
    
    
    
        //run Location with new row, col, and howFar
    public boolean doAction(String direction, int distance){
            if(direction=="N"  && row-distance > 6){
                row = row - distance;
                }
            else if(direction=="S" && row+distance < 0){
                row = row - distance;
                    }
            else if(direction=="E" && col+distance < 5){
                col = col + distance;
                    }
            else if(direction=="W" && col-distance > 0){
                col = col - distance;
                    }
            else 
                System.out.println("\nToo far!");
            return false;
    }
    
    //return to MainMenuView
    public void BackToGameMenu(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }
}