/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import finalfrontier.control.LocationControl;
import java.io.Serializable;
import finalfrontier.view.LocationMapView;
import finalfrontier.model.Location;
import finalfrontier.view.EventView;
import java.util.Arrays;

/**
 *
 * @author rschw
 */
public class Map {
    
    char thisOne = 'X';
    //save Location specs to array
    public char mapMatrix[][] = {                
        {'_', '_', '_', '_', '_'},          
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'}, 
        };
    
    
    public Map() {
        
    }
    public char mapColumn = (char) LocationControl.getCol();
    public char mapRow = (char) LocationControl.getRow();
    
// get and set Row
    public int getRow() {
        return mapRow;
    }
    public void setRow(int row) {
        this.mapRow = (char) row;
    }
    
// get and set Column
    public int getColumn() {
        return mapColumn;
    }
    public void setColumn(int column) {
        this.mapColumn = (char) column;
    }
    
// equals
    
//Display the Map
    public String displayMap(){
        EventView hereChar = new EventView();
        //thisOne = hereChar.getWasHere();
        //System.out.println("Current character: "+hereChar.wasHere);
    System.out.println(mapRow + " : " + mapColumn);
        mapMatrix[6][4] = '§';
        mapMatrix[mapRow][mapColumn] = hereChar.wasHere;
    System.out.println("\n   _ _ _ _ _");
    System.out.println(
            "6 "+"|" + mapMatrix[6][0] + "|" + mapMatrix[6][1] + "|" + mapMatrix[6][2] + "|" + mapMatrix[6][3] + "|" + mapMatrix[6][4] + "|\n" +
            "5 "+"|" + mapMatrix[5][0] + "|" + mapMatrix[5][1] + "|" + mapMatrix[5][2] + "|" + mapMatrix[5][3] + "|" + mapMatrix[5][4] + "|\n" +
            "4 "+"|" + mapMatrix[4][0] + "|" + mapMatrix[4][1] + "|" + mapMatrix[4][2] + "|" + mapMatrix[4][3] + "|" + mapMatrix[4][4] + "|\n" +
            "3 "+"|" + mapMatrix[3][0] + "|" + mapMatrix[3][1] + "|" + mapMatrix[3][2] + "|" + mapMatrix[3][3] + "|" + mapMatrix[3][4] + "|\n" +
            "2 "+"|" + mapMatrix[2][0] + "|" + mapMatrix[2][1] + "|" + mapMatrix[2][2] + "|" + mapMatrix[2][3] + "|" + mapMatrix[2][4] + "|\n" +
            "1 "+"|" + mapMatrix[1][0] + "|" + mapMatrix[1][1] + "|" + mapMatrix[1][2] + "|" + mapMatrix[1][3] + "|" + mapMatrix[1][4] + "|\n" +
            "0 "+"|" + mapMatrix[0][0] + "|" + mapMatrix[0][1] + "|" + mapMatrix[0][2] + "|" + mapMatrix[0][3] + "|" + mapMatrix[0][4] + "|\n" +
                      "   0"+                        " 1"+                     " 2"+                  " 3"+                     " 4");
    return Arrays.toString(mapMatrix);
        
    }
    
}
