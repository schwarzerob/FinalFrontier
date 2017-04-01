/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.FinalFrontier;
import finalfrontier.model.Resources;
import finalfrontier.model.Wagon;

/**
 *
 * @author rschw
 */
public class ResourceView extends View{
    public ResourceView(){
        super(      " -------------------------------------"
                   +"\n|   Resource Display                |"
                   +"\n-------------------------------------"
                   +"\nSelect which resource to view content"
                   +"\nW - Wood"
                   +"\nG - Grain"
                   +"\nO - Ore"
                   +"\nS - Sheep"
                   +"\nC - Cash"
                   +"\nB - Battle equipment"
                   +"\nT - Total count"
                   +"\nQ - Quit to Game Menu"
                   +"\n-------------------------------------");
    }
    int amountWood = Resources.wood;
    int amountGrain = Resources.grain;
    int amountOre = Resources.ore;
    int amountSheep = Resources.sheep;
    int amountSwords = Resources.swords;
    int amountGold = Resources.gold;
    int amountShields = Resources.shields;
    int amountBows = Resources.bows;
    
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
        case "T":
            this.totalResource();
            break;
        case "B":
            this.resourceBattle();
            break;
        case "C":
            this.resourceGold();
            break;
        default:
            this.console.println("We don't have that type of resource. \n What type?");
    }
        return false;
    }
    
    private void resourceWood(){
            this.console.println("You have "+amountWood+" wood.");
        
    }
    private void resourceGrain(){
            this.console.println("You have "+amountGrain+" grain.");
        
    }
    private void resourceOre(){
            this.console.println("You have "+amountOre+" ore.");
        
    }
    private void resourceSheep(){
            this.console.println("You have "+amountSheep+" sheep.");
        
    }
    private void resourceBattle(){
            this.console.println("You have "+amountSwords+" swords, "+amountShields+" shields, and "+amountBows+" bows.");
    }
    private void resourceGold(){
            this.console.println("You have "+amountGold+" gold.");
        
    }
    private void totalResource(){
            int sum=amountWood+amountGrain+amountOre+amountSheep+amountSwords+amountGold+
            amountShields+amountBows;
        this.console.println(sum+" items, and "+Wagon.area+" space in the wagon");
        
    }
}
