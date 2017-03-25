/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

import static finalfrontier.model.MyCharacter.LUMBERJACK;
import static finalfrontier.model.MyCharacter.LUMBERJACK;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Gabriel
 */
public class Resources {
   public Resources (String Type, int amount) {
   
   }
    private int quantity;
    private String type;
    public static int wood;
    public static int grain;
    public static int ore;
    public static int sheep;
    public static int swords;
    public static int gold;
    public static int shields = 1;
    public static int bows = 1;
    public static int rope = 1;
   
    public ArrayList<Resources> addContent(){
    
    ArrayList<Resources> content = new ArrayList<>();
    content.add(new Resources("Wood", wood));
    content.add(new Resources("Grain", grain));
    content.add(new Resources("Ore", ore));
    content.add(new Resources("Sheep", sheep));
    content.add(new Resources("Swords", swords));
    content.add(new Resources("Gold", gold));
    content.add(new Resources("Shields", shields));
    return content;
    }
    public int MaxAmount(){
        int max = wood+grain+ore+sheep+swords+gold+shields+bows+rope;
        int wagonSpace = Wagon.area;
        if(max>wagonSpace){
            System.out.println("Not enough room in the wagon!");
        }
       return 0;
        
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
