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
public class LocationControl2 implements Serializable {
    
    public int LocationDirection(int row, int column, char visited){
       //row = 1;
       //column = 1;
       Scanner whichWay = new Scanner(System.in);
       char direction = whichWay.next().charAt(0);
       Scanner howFar = new Scanner(System.in);
       int distance = howFar.nextInt();
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
        return row;    
    }
}