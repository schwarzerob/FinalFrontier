/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.model.Player;
import finalfrontier.model.Resources;

/**
 *
 * @author rschw
 */
public class ResourceView extends View{
    public ResourceView(){
        super("\n"
                   +"\n-------------------------------------"
                   +"\n|   Resource Display                |"
                   +"\n-------------------------------------"
                   +"\nSelect which resource to view content"
                   +"\nW - Wood"
                   +"\nG - Grain"
                   +"\nO - Ore"
                   +"\nS - Sheep"
                   +"\nB - Battle"
                   +"\nQ - Quit to Game Menu"
                   +"\n-------------------------------------");
    }
    int amountWood = Resources.wood;
    int amountGrain = Resources.grain;
    int amountOre = Resources.ore;
    int amountSheep = Resources.sheep;
    int amountSwords = Resources.swords;

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
        case "S":
            this.resourceSheep();
            break;
        case "B":
            this.resourceSwords();
            break;
        default:
            System.out.println("We don't have that type of resource. \n What type?");
    }
        return false;
    }
    
    private void resourceWood(){
            System.out.println("You have "+amountWood+" wood.");
        
    }
    private void resourceGrain(){
            System.out.println("You have "+amountGrain+" grain.");
        
    }
    private void resourceOre(){
            System.out.println("You have "+amountOre+" ore.");
        
    }
    private void resourceSheep(){
            System.out.println("You have "+amountSheep+" sheep.");
        
    }
    private void resourceSwords(){
            System.out.println("You have "+amountSwords+" swords.");
        
    }
}
