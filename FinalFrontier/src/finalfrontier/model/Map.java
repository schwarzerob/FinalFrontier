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
public class Map {
    
    
    //save Location specs to array
    char mapMatrix[][] = {                
        {'_', '_', '_', '_', '_'},          
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'},         
        {'_', '_', '_', '_', '_'}, 
        };
    private char mapColumn = (char) LocationMapView.col;
    private char mapRow = (char) LocationMapView.row;
    
    public Map() {
        
    }
    
// get and set Row
    public int getRow() {
        return LocationMapView.row;
    }
    public void setRow(int row) {
        this.mapRow = (char) row;
    }
    
// get and set Column
    public int getColumn() {
        return LocationMapView.col;
    }
    public void setColumn(int column) {
        this.mapColumn = (char) column;
    }
    
// equals
    
//Display the Map
    public String displayMap(){
        mapMatrix[mapRow][mapColumn] = 'X';
    System.out.println("   _ _ _ _ _");
    System.out.println("6 "+"|" + mapMatrix[6][0] + "|" + mapMatrix[6][1] + "|" + mapMatrix[6][2] + "|" + mapMatrix[6][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("5 "+"|" + mapMatrix[5][0] + "|" + mapMatrix[5][1] + "|" + mapMatrix[5][2] + "|" + mapMatrix[5][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("4 "+"|" + mapMatrix[4][0] + "|" + mapMatrix[4][1] + "|" + mapMatrix[4][2] + "|" + mapMatrix[4][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("3 "+"|" + mapMatrix[3][0] + "|" + mapMatrix[3][1] + "|" + mapMatrix[3][2] + "|" + mapMatrix[3][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("2 "+"|" + mapMatrix[2][0] + "|" + mapMatrix[2][1] + "|" + mapMatrix[2][2] + "|" + mapMatrix[2][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("1 "+"|" + mapMatrix[1][0] + "|" + mapMatrix[1][1] + "|" + mapMatrix[1][2] + "|" + mapMatrix[1][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("0 "+"|" + mapMatrix[0][0] + "|" + mapMatrix[0][1] + "|" + mapMatrix[0][2] + "|" + mapMatrix[0][3] + "|" + mapMatrix[0][4] + "|");
    System.out.println("   0 1 2 3 4");
        return null;
    }
    
    
}
