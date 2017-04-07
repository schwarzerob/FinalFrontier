/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.FinalFrontier;
import finalfrontier.exceptions.LocationControlExceptions;
import finalfrontier.model.Location;
import finalfrontier.model.Map;
import java.io.PrintWriter;
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
    protected final PrintWriter console = FinalFrontier.getOutFile();
    public static int row;
    public static int col;
    public LocationControl() {
    }
        Location location = new Location();
            
    public void goNorth(int distance)
        throws LocationControlExceptions{
        try{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        Map.setRow(row);
        Map.setColumn(col);
        row += distance;
        this.console.print(Map.row+": "+Map.column);
        Map.displayMap();
        System.out.println("North");
        System.out.println(location.toString());  //test view
        }catch(LocationControlExceptions ex){
            this.console.print(ex.getMessage());}
        
    }        
    public void goSouth(int distance)
        throws LocationControlExceptions{
        try{
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        row -= distance;
        if(row+distance > 6 || row+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        Map.setRow(row);
        Map.setColumn(col);
        this.console.print(row+": "+col);
        Map.displayMap();
        System.out.println("North");
        System.out.println(location.toString());  //test view
        }catch(LocationControlExceptions ex){
            this.console.print(ex.getMessage());}
    }        
    public void goEast(int distance)
        throws LocationControlExceptions{
        try{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        Map.setRow(row);
        Map.setColumn(col);
        col += distance;
        this.console.print(row+": "+col);
        Map.displayMap();
        System.out.println("North");
        System.out.println(location.toString());  //test view
        }catch(LocationControlExceptions ex){
            this.console.print(ex.getMessage());}
    }        
    public void goWest(int distance)
        throws LocationControlExceptions{
        try{
        if(col+distance > 6 || col+distance <0){
            throw new LocationControlExceptions("\nToo far!");
        }
        Map.setRow(row);
        Map.setColumn(col);
        col -= distance;
        this.console.print(row+": "+col);
        Map.displayMap();
        System.out.println("North");
        System.out.println(location.toString());  //test view
        }catch(LocationControlExceptions ex){
            this.console.print(ex.getMessage());}
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
