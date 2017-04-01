/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.exceptions.LocationControlExceptions;
import finalfrontier.model.Location;
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
    public int row=0;
    public int col=0;
    public LocationControl() {
    }
        Location location = new Location();
        Map displayMap = new Map();
            
    public void goNorth(int distance)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        //int map = FinalFrontier.
        row += distance;
        location.setRow(row);
        location.setColumn(col);
        displayMap.displayMap();
        System.out.println("North");
        //System.out.println(row + " : " + col);  //test view
        System.out.println(location.toString());  //test view
        
    }        
    public void goSouth(int distance)
        throws LocationControlExceptions{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        row -= distance;
        location.setRow(row);
        location.setColumn(col);
        displayMap.displayMap();
        System.out.println("South");
        //System.out.println(row + " : " + col);  //test view
        System.out.println(location.toString());  //test view
    }        
    public void goEast(int distance)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col += distance;
        location.setRow(row);
        location.setColumn(col);
        displayMap.displayMap();
        System.out.println("East");
        //System.out.println(row + " : " + col);  //test view
        System.out.println(location.toString());  //test view
    }        
    public void goWest(int distance)
        throws LocationControlExceptions{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        col -= distance;
        location.setRow(row);
        location.setColumn(col);
        displayMap.displayMap();
        System.out.println("West");
        //System.out.println(row + " : " + col);  //test view
        System.out.println(location.toString());  //test view
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
