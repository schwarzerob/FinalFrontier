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
public class Location implements Serializable{
    private int row;
    private int column;
    private char visited;
    
    public Location(){
        }
// get and set Row
    public int getRow() {
        //return row;
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    
// get and set Column
    public int getColumn() {
        //return column;
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    
    //create random integer to select which event and run to EventView
    
 
    
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        return true;
    }
    
// toString
    @Override
    public String toString() {
        System.out.println("Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}');
        return "";
    }
    
}
