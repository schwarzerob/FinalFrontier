/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import finalfrontier.FinalFrontier;
import finalfrontier.control.LocationControl;
import java.io.Serializable;
import finalfrontier.view.LocationMapView;
import finalfrontier.model.Location;
import finalfrontier.view.EventView;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author rschw
 */
public class Map {
    
    static PrintWriter console;
    static char thisOne = 'X';
    //save Location specs to array
    public static char mapMatrix[][] = {                
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

    public static int column;
    public static int row;
    
// equals

    
//Display the Map
    public static String displayMap(){
        //Location location = new Location();
        column = LocationControl.col;
        row = LocationControl.row;
        //EventView hereChar = new EventView();
        
        //Map.console.print(Map.row + " : " + Map.column);
        //System.out.println(LocationControl.row + " : " + LocationControl.col);
        //System.out.println(LocationMapView.row + " : " + LocationMapView.col);
        
        mapMatrix[6][4] = '§';
        mapMatrix[row][column] = thisOne;
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
        mapMatrix[row][column] = EventView.wasHere;
    return Arrays.toString(mapMatrix);
        
    }

    public static int getColumn() {
        return column;
    }
    public static void setColumn(int column) {
        Map.column = column;
    }
    public static int getRow() {
        return row;
    }
    public static void setRow(int row) {
        Map.row = row;
    }    
    
}
