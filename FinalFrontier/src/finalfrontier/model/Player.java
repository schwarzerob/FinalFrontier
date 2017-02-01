/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author rschw
 */
public class Player implements Serializable{
    private String name;
    
// Constructor
    public Player() {
    }
    
// get and set Name    
// What is this players name?
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
// hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.name);
        return hash;
    }
    
// toString
    @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
// What character is the Player using?
    
}
