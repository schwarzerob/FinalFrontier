/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.model.Player;

/**
 *
 * @author rschw
 */
public class ResourceView extends View{
    public ResourceView(){
        super("\n"
                   +"\n-------------------------------------"
                   +"\n|   Resource Display                 |"
                   +"\n-------------------------------------"
                   +"\nSelect which resource to view content"
                   +"\nW - Wood"
                   +"\nG - Grain"
                   +"\nO - Ore"
                   +"\nQ - Quit to Game Menu"
                   +"\n-------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch(value){
        case "W":
            this.resourceWood();
            break;
        case "G":
            this.resourceGrain();
            break;
        case "O":
            this.resourceOre();
            break;
    }
        return false;
    }
    
    private void resourceWood(){
        System.out.println("You have ___ wood.");
        
    }
    private void resourceGrain(){
        System.out.println("You have ___ grain.");
        
    }
    private void resourceOre(){
        System.out.println("You have ___ ore.");
        
    }
}
