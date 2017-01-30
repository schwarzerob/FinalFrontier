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
public class Resources implements Serializable {
    private int quantity;
    private String type;
    
   public Resources () {
   
   }
   
   //getter for quantity and type

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
   
    //setter for quantity and type

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
