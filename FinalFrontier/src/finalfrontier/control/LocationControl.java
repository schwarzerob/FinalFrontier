/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

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
            if(row+distance <= 6){
                row += distance;}
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("North");
            throw new LocationControlExceptions("\nToo far!");
    }        
    public static void goSouth(int distance, int row)
        throws LocationControlExceptions{
            if(row+distance <= 6){
                row -= distance;}
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("South");
            throw new LocationControlExceptions("\nToo far!");
    }        
    public static void goEast(int distance, int col)
        throws LocationControlExceptions{
            if(col+distance <= 6){
                col += distance;}
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("East");
            throw new LocationControlExceptions("\nToo far!");
    }        
    public static void goWest(int distance, int col)
        throws LocationControlExceptions{
            if(col+distance <= 6){
                col -= distance;}
        Map displayMap = new Map();
        displayMap.displayMap();
        System.out.println("West");
            throw new LocationControlExceptions("\nToo far!");
    }
    
    public static void Location(int row, int column, char visited)
            throws LocationControlExceptions{                           //throws
       row = 1;
       column = 1;
       Scanner whichWay = new Scanner(System.in);
       char direction = whichWay.next().charAt(0);
       
       Scanner howFar = new Scanner(System.in);
       int distance = howFar.nextInt();
       visited = '_';
        switch (direction) {
            case 'N':
            case 'n':
                 row = row + distance;
                 //return row;
                 break;
            case 'E':
            case 'e':
                 column = column - distance;
                 //return column;
                 break;                 
            case 'S':
            case 's':
                 row = row - distance;
                 //return row;
                 break;
            case 'W':
            case 'w':
                 column = column + distance;
                 //return column;
                 break;
        default:
            System.out.println("Invalid input.");
            break;
        }
        if(row>6 || row<0 || column>4 || column<0){
            throw new LocationControlExceptions("That's off the map!");    //throw new
        }   
    }
}
