/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class LocationControl {
    public char Location(int row, int column, char visited){
        char direction = 0;
        int distance = 0;
        
    Scanner inputDirection = new Scanner(System.in);
        direction = inputDirection.nextInt();
        if (distance > 10 || distance <0) {
        }
        
    Scanner inputDistance = new Scanner(System.in);
        distance = inputDistance.nextInt();
        if (distance > 10 || distance <0) {
            return -1;
        }
        
        if (direction != 'N' || direction != 'E' || direction != 'S' || direction != 'W') {
            return '0';
        }
        switch (direction) {
            case 'N':
            case 'n':
                 row = row + distance;
                return visited = 'X';
                
        switch (direction) 
            case 'E':
            case 'e':
                 column = column - distance;
                return visited = 'X';
                
        switch (direction) 
            case 'S':
            case 's':
                 row = row - distance;
                return visited = 'X';
                
        switch (direction) 
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
