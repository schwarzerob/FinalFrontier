/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.exceptions.wagonControlException;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class wagonControl implements Serializable {
    public int calcMaxContent(String dimension, int length, int width, int height, int increase) throws wagonControlException {
        
        //Variables
               int cost;
               int size;
        
        if (dimension == null) {
            return -1;
        }
        switch (dimension) {
            case "L":
            case "l":
                 cost =(((width + height)*2)*increase);
                return cost;
             
            case "W":
            case "w":
                cost =(((length + height)*2)*increase);
                return cost;
               
            case "H":
            case "h":
                cost =(((width + length)*2)*increase);
                return cost;
                
            default:
                System.out.println("Invalid input.");
                break;
        }
//input size
    Scanner inputSize = new Scanner(System.in);
        size = inputSize.nextInt();
        if (size > 10 || size <0) {
      
        }
        //calculate area
        throw new wagonControlException();
    }

    //void calcMaxContent(double length, double width, double height) {
    //    throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    //}
    
}
