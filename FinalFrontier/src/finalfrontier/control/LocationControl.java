/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.exceptions.LocationControlExceptions;
import finalfrontier.model.Map;
import java.io.Serializable;

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
    public int row = 0;
    public int col = 0;
    public LocationControl() {
    }
            
    public void goNorth(int distance)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        //int map = FinalFrontier.
        row += distance;
        Map displayMap = new Map();
        displayMap.setRow(row);
        displayMap.setColumn(col);
        displayMap.displayMap();
        System.out.println("North");
        
    }        
    public void goSouth(int distance)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        row -= distance;
        Map displayMap = new Map();
        displayMap.setRow(row);
        displayMap.setColumn(col);
        displayMap.displayMap();
        System.out.println("South");
    }        
    public void goEast(int distance)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col += distance;
        Map displayMap = new Map();
        displayMap.setRow(row);
        displayMap.setColumn(col);
        displayMap.displayMap();
        System.out.println("East");
    }        
    public void goWest(int distance)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col -= distance;
        Map displayMap = new Map();
        displayMap.setRow(row);
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
