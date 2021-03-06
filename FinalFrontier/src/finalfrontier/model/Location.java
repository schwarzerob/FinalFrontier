/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import finalfrontier.view.LocationMapView;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author rschw
 */
public class Location implements Serializable{
    public static int row;
    public static int column;
    private char visitedChar = 'X';
    Map map = new Map();
    
    public Location(){
        }
    LocationMapView locationMapView = new LocationMapView();
    
// get and set Row and Column

    public static int getRow() {
        return row;
    }

    public static void setRow(int row) {
        Location.row = row;
    }

    public static int getColumn() {
        return column;
    }

    public static void setColumn(int column) {
        Location.column = column;
    }
    
    
    //create random integer to select which event and run to EventView
    Random rand = new Random();
        public int  event;
    
    public int getEvent(){
        if(map.getColumn()==4 && map.getRow()==6){
            event = 5;
        }else{event = rand.nextInt(4);}
        return event;
    }
        
    public String ChooseToGo(){
        System.out.println("Location Class");
        return null;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visitedChar != other.visitedChar) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.row;
        hash = 73 * hash + this.column;
        hash = 73 * hash + this.visitedChar;
        return hash;
    }
    
// toString
    @Override
    public String toString() {
        System.out.println("Location{" + "row=" + row + ", column=" + column + ", visited=" + visitedChar + '}');
        return "";
    }
    
}
