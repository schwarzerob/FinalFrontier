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
    public char Location(int row, int column, char visited){
        char direction = 0;
        int distance = 0;
       row = 1;
       column = 1;
       visited = '_';
       
    Scanner inputDistance = new Scanner(System.in);
        distance = inputDistance.nextInt();
        if (distance > 10 || distance <1) {
            return '_';
        }
        
        if (direction != 'N' || direction != 'E' || direction != 'S' || direction != 'W') {
            return '_';
        }
            
        switch (direction) {
            case 'N':
            case 'n':
                 row = row + distance;
                 return visited = 'X';
            case 'E':
            case 'e':
                 column = column - distance;
                 return visited = 'X';
            case 'S':
            case 's':
                 row = row - distance;
                 return visited = 'X';
            case 'W':
            case 'w':
                 column = column + distance;
                 return visited = 'X';
                
        default:
            System.out.println("Invalid input.");
            break;
        }
    
//input size
        return 1;    
    }
}
