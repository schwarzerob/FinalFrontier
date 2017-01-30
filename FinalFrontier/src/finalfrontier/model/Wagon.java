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
    private int length = 3;
    private int width = 2;
    private int height = 2;
    
    public Wagon(){
    }
// get and set length
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
// get and set width
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
//get and set height
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    
    
}
