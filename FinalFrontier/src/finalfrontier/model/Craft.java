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
    
}