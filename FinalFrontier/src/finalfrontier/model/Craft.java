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
public class Craft implements Serializable {
    private int neededResources;
    private String create;
    private int amountRequired; 
    
    public Craft () {
    }
 // Getter for NeededResources, Create, AmountRequired

    public int getNeededResources() {
        return neededResources;
    }

    public String getCreate() {
        return create;
    }

    public int getAmountRequired() {
        return amountRequired;
    }
    
    // setter for NeededResources, Create, AmountRequired

    public void setNeededResources(int neededResources) {
        this.neededResources = neededResources;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public void setAmountRequired(int amountRequired) {
        this.amountRequired = amountRequired;
    }
    //hash

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.neededResources;
        hash = 23 * hash + Objects.hashCode(this.create);
        hash = 23 * hash + this.amountRequired;
        return hash;
    }
//equals
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
        final Craft other = (Craft) obj;
        if (this.neededResources != other.neededResources) {
            return false;
        }
        if (this.amountRequired != other.amountRequired) {
            return false;
        }
        if (!Objects.equals(this.create, other.create)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Craft{" + "neededResources=" + neededResources + ", create=" + create + ", amountRequired=" + amountRequired + '}';
    }
    
}