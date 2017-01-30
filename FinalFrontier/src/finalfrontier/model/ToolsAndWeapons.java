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
public class ToolsAndWeapons implements Serializable{
    private char type;
    
    public ToolsAndWeapons(){
    }

// get and set Type
    public char getType() {
        return type;
    }
    public void setType(char type) {
        this.type = type;
    }
    
}
