/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

/**
 *
 * @author rschw
 */
public class LocationMapView {
    public LocationMapView() {
        //variables:
        int row = 0;
        int col = 0;
        int far = 0;
        //save Location specs to array
        int mapMatrix[][] = new int[7][5];
        //changes from current location coordinates
}
    
    //display map
    public String showMap(){
        //print Map
        //each row is an individual row in mapMatrix[7][5]
        //specific character for each event at visited location placed on map location.
        return null;
    }
    
    //get coordinates for destination
    public int whereToGo(){
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
