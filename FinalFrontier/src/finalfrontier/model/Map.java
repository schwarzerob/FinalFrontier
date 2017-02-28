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
public class Map implements Serializable {
    private int row;
    private int column;
    char eventChar = '_';
    
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
    
//Display Map
    public String displayMap(){
    System.out.println(" _________________________________________");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|     |     |     |     |     |     |     |");
    System.out.println("|_____|_____|_____|_____|_____|_____|_____|");
        return null;
    }
    
    
}
