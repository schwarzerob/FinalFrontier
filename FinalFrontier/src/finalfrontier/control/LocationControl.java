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
    public int row = 0;
    public int col = 0;
            
    public static void goNorth(int distance, int row)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        //int map = FinalFrontier.
        row += distance;
        //setRow(row);
        Map displayMap = new Map();
        displayMap.setRow(row);
        displayMap.displayMap();
        System.out.println("North");
        
    }        
    public static void goSouth(int distance, int row)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        row -= distance;
        //setRow(row);
        Map displayMap = new Map();
        displayMap.setRow(row);
        displayMap.displayMap();
        System.out.println("South");
    }        
    public static void goEast(int distance, int col)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col += distance;
        //setCol(col);
        Map displayMap = new Map();
        displayMap.setColumn(col);
        displayMap.displayMap();
        System.out.println("East");
    }        
    public static void goWest(int distance, int col)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col -= distance;
        //setCol(col);
        Map displayMap = new Map();
        displayMap.setColumn(col);
        displayMap.displayMap();
        System.out.println("West");
    }

    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
}
