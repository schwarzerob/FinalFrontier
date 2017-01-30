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
// get and set Visited
    public char getVisited() {
        return visited;
    }
    public void setVisited(char visited) {
        this.visited = visited;
    }
    
}
