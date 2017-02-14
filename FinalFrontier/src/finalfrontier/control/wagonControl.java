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
    public int calcMaxContent(String dimension, int width, int height, int increase) {
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
                System.out.println("Constructing on Width of the wagon");
                System.out.println("How much?");
                break;
            case "H":
            case "h":
                System.out.println("Constructing on Width of the wagon");
                System.out.println("How much?");
                //}else if (dimension == "B" || dimension == "b") {
                break;
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
    }
    
}
