/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;

/**
 *
 * @author rschw
 */
public class Wagon implements Serializable {
    public static int length;
    public static int width;
    public static int height;
    public static int area;
    
    public Wagon(){
        area = length*width*height;
    }
// toString
    @Override
    public String toString() {
        return  "Wagon{" + "length: " + length + ", width: " + width + ", height: " + height + '}'+
                "\nAnd can contain a maximum of "+area+"items.";
    }
    
    
}
