/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;
import finalfrontier.view.LocationMapView;

/**
 *
 * @author rschw
 */
public class Map implements Serializable {
    private int row;
    private int column = LocationMapView.class.getModifiers();
    char eventChar = '_';
    
    //save Location specs to array
    int mapMatrix[][] = {                
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0},              
        {0, 0, 0, 0, 0}
        };
    
    public Map(){
    }
    
// get and set Row
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    
// get and set Column
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    
// hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.row;
        hash = 19 * hash + this.column;
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
        final Map other = (Map) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }
    
// toString
    @Override
    public String toString() {
        return "Map{" + "row=" + row + ", column=" + column + '}';
    }
    
//Display the Map
    public String displayMap(){
    System.out.println(" _________");
    System.out.println("|" + mapMatrix[6][0] + "|" + mapMatrix[6][1] + "|" + mapMatrix[6][2] + "|" + mapMatrix[6][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("|" + mapMatrix[5][0] + "|" + mapMatrix[5][1] + "|" + mapMatrix[5][2] + "|" + mapMatrix[5][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("|" + mapMatrix[4][0] + "|" + mapMatrix[4][1] + "|" + mapMatrix[4][2] + "|" + mapMatrix[4][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("|" + mapMatrix[3][0] + "|" + mapMatrix[3][1] + "|" + mapMatrix[3][2] + "|" + mapMatrix[3][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("|" + mapMatrix[2][0] + "|" + mapMatrix[2][1] + "|" + mapMatrix[2][2] + "|" + mapMatrix[2][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("|" + mapMatrix[1][0] + "|" + mapMatrix[1][1] + "|" + mapMatrix[1][2] + "|" + mapMatrix[1][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("|" + mapMatrix[0][0] + "|" + mapMatrix[0][1] + "|" + mapMatrix[0][2] + "|" + mapMatrix[0][3] + "|" + mapMatrix[0][4] + "|");
        return null;
    }
    
    
}
