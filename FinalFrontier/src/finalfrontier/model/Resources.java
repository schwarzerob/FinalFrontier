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
public class Resources implements Serializable {
   public Resources () {
   
   }
    private int quantity;
    private String type;
    public static int wood = 10;
    public static int grain = 10;
    public static int ore = 10;
    public static int sheep = 10;
    public static int swords = 1;
   
    public int MaxAmount(){
        int max = wood+grain+ore+sheep+swords;
        int wagonSpace = Wagon.area;
        if(max>wagonSpace){
            System.out.println("Not enough room in the wagon!");
        }
        
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
 //hash   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + this.quantity;
        hash = 13 * hash + Objects.hashCode(this.type);
        return hash;
    }

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
        final Resources other = (Resources) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resources{" + "quantity=" + quantity + ", type=" + type + '}';
    }
    
}
