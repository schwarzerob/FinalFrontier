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
// hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.type;
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
        final ToolsAndWeapons other = (ToolsAndWeapons) obj;
        if (this.type != other.type) {
            return false;
        }
        return true;
    }
// toString
    @Override
    public String toString() {
        return "ToolsAndWeapons{" + "type=" + type + '}';
    }
    
}
