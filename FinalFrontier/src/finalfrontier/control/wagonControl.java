/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.exceptions.WagonException;
import finalfrontier.model.Wagon;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author rschw
 */
public class wagonControl implements Serializable {

    public wagonControl() {
    }
    public static int height = 2;
    public static int width = 2;
    public static int length= 2;
    public static int area = height*length*width;
    
    public static void longer(int howFar) 
        throws WagonException{
            //cost: 1 wood per increased area
            int increase = height*width*howFar;
            area += increase;
        throw new WagonException();
    }
    public static void wider(int howWide) 
        throws WagonException{
            //cost: 1 wood per increased area
            int increase = length*height*howWide;
            area += increase;
        throw new WagonException();
    }
    public static void taller(int howTall) 
        throws WagonException{
            //cost: 1 wood per increased area
            int increase = length*width*howTall;
            area += increase;
        throw new WagonException();
    }

    //void calcMaxContent(double length, double width, double height) {
    //    throw new UnsupportedOperationException("Not supported yet."); 
    //To change body of generated methods, choose Tools | Templates.
    //}
    
}
