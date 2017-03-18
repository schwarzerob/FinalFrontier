/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.model;

/**
 *
 * @author rschw
 */
public class Dragon {
    private int healthAttack;
    private int healthPlayer;
    
    public Dragon (){
    
}

//get and set healthAttack

    public int getHealthAttack() {
        return healthAttack;
    }

    public void setHealthAttack(int healthAttack) {
        this.healthAttack = healthAttack;
    }
    
    //getter and setter healthPlayer 

    public int getHealthPlayer() {
        return healthPlayer;
    }

    public void setHealthPlayer(int healthPlayer) {
        this.healthPlayer = healthPlayer;
    }
    /*
//Hash
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.healthAttack;
        hash = 71 * hash + this.healthPlayer;
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
        final Attack other = (Attack) obj;
        if (this.healthAttack != other.healthAttack) {
            return false;
        }
        if (this.healthPlayer != other.healthPlayer) {
            return false;
        }
        return true;
    }
        
    // to string
*/
    @Override
    public String toString() {
        return "Attack{" + "healthAttack=" + healthAttack + ", healthPlayer=" + healthPlayer + '}';
    }

}