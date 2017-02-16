/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

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
    public int Location(int row, int column, char visited){
        char direction = 'N';
       row = 1;
       column = 1;
       int distance = 0;
       visited = '_';
        
        if (direction != 'N' || direction != 'E' || direction != 'S' || direction != 'W') {
            return '_';
        }
            
        switch (direction) {
            case 'N':
            case 'n':
                 row = row + distance;
                 return row;
            case 'E':
            case 'e':
                 column = column - distance;
                 return column;
            case 'S':
            case 's':
                 row = row - distance;
                 return row;
            case 'W':
            case 'w':
                 column = column + distance;
                 return column;
                
        default:
            System.out.println("Invalid input.");
            break;
        }
    
//input size
        return 1;    
    }
}
