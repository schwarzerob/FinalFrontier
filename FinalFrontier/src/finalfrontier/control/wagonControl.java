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
    public void calcMaxContent(double length, double width, double height) {
        String dimension;
        int size;
    System.out.println("Which dimension are you going to build on?");
    System.out.println("L = Length");
    System.out.println("W = Width");
    System.out.println("H = Height");
    System.out.println("B = Go back");
//input dimension
    Scanner inputDimension = new Scanner(System.in);
        dimension = inputDimension.next();
                
        //if not
        if (dimension == "L" || dimension == "l") {
            System.out.println("Constructing on Length of the wagon");
            System.out.println("How much?");
        } else if (dimension == "W" || dimension == "w") {
            System.out.println("Constructing on Width of the wagon");
            System.out.println("How much?");            
        }else if (dimension == "H" || dimension == "h") {
            System.out.println("Constructing on Width of the wagon");
            System.out.println("How much?");   
        //}else if (dimension == "B" || dimension == "b") {
        }else {
            System.out.println("Invalid input.");
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