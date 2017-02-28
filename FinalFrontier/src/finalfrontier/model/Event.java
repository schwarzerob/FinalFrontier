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
    
    //hashCoode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.symbol);
        hash = 59 * hash + Objects.hashCode(this.description);
        hash = 59 * hash + Objects.hashCode(this.blockedLocation);
        return hash;
    }
    
//Equals
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
        final Event other = (Event) obj;
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Event{" + "symbol=" + symbol + ", description=" + description + ", blockedLocation=" + blockedLocation + '}';
    }
    
}
