/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import java.io.Serializable;

/**
 *
 * @author Gabriel
 */
public class Event implements Serializable {
    private String symbol;
    private String description;
    private String blockedLocation;
    
    public Event() {
    }
    
    //Getter for Symbol, description, blockedLocation

    public String getSymbol() {
        return symbol;
    }

    public String getDescription() {
        return description;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }
   
    //setter for Symbol, description, blockedLocation

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }
    
}
