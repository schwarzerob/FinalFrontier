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
public class Attack implements Serializable  {
    private int healthAttack;
    private int healthPlayer;
    
    public Attack (){
    
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
    
}