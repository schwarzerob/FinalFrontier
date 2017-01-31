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
    private int length;
    private int width;
    private int height;
    int area;
    
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
// get and set height
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
// hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.length;
        hash = 79 * hash + this.width;
        hash = 79 * hash + this.height;
        return hash;
    }
// equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Wagon other = (Wagon) obj;
        if (this.length != other.length) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }
// toString
    @Override
    public String toString() {
        return "Wagon{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
    }
    
    
}
