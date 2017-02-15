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
public class wagonControl implements Serializable {
    public int calcMaxContent(String dimension, int length, int width, int height, int increase) {
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
            System.out.println("Invalid Input.");
        }
        //calculate area
        return 0;
    }
    
}
