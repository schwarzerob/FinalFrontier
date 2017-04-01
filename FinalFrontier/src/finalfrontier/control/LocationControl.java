/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.FinalFrontier;
import finalfrontier.exceptions.LocationControlExceptions;
import finalfrontier.model.Map;
import static finalfrontier.view.LocationMapView.row;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author rschw
 */

/*
LocationControl class changes the location on the map.  
Player chooses direction, then how far to go.  After 
the method is complete, the location on the map will 
be changed by the value of either the row, or the column.
*/
public class LocationControl implements Serializable {

    public LocationControl() {
    }
    public static int row = 0;
    public static int col = 0;
            
    public static void goNorth(int distance, int row)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        Map map = FinalFrontier.
        row = row + distance;
        Map.setRow(row);
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("North");
        
    }        
    public static void goSouth(int distance, int row)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        row = row - distance;
        Map.setRow(row);
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("South");
    }        
    public static void goEast(int distance, int col)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col = col + distance;
        Map.setColumn(col);
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("East");
    }        
    public static void goWest(int distance, int col)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col = col - distance;
        Map.setColumn(col);
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("West");
    }

    public static int getRow() {
        return row;
    }
    public static void setRow(int row) {
        LocationControl.row = row;
    }
    public static int getCol() {
        return col;
    }
    public static void setCol(int col) {
        LocationControl.col = col;
    }
}
