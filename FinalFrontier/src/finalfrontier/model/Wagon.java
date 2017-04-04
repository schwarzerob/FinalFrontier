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
    public static int length=5;
    public static int width=3;
    public static int height=3;
    public static int area=45;
    
    public Wagon(){
    }
    public String toString(String size) {
        area = length*width*height;
        size =  "Wagon{" + "length: " + length + ", width: " + width + ", height: " + height + '}'+
                "\nAnd can contain a maximum of "+area+"items.";
        return size;
    }

    public static int getLength() {
        return length;
    }

    public static void setLength(int length) {
        Wagon.length = length;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Wagon.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Wagon.height = height;
    }

    public static int getArea() {
        return area;
    }

    public static void setArea(int area) {
        Wagon.area = area;
    }
    
}
