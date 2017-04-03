/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.CraftingControl;
import finalfrontier.exceptions.CraftingControlException;
import finalfrontier.model.Craft.CraftingItems;
import finalfrontier.model.Resources;

/**
 *
 * @author rschw
 */
public class CraftingView extends View{
    public CraftingView(){
            super ( "\n"
                   +"\n-------------------------------------"
                   +"\n|   Resource Display                |"
                   +"\n-------------------------------------"
                   +"\nSelect which resource to view content"
                   +"\nS - Sword"
                   +"\nP - Shield"
                   +"\nB - Bow"
                   +"\nW - Wagon"
                   +"\nC - Rope"
                   +"\nSH - Show Cheapest Craft"
                   +"\nQ - Quit to Game Menu"
                   +"\n-------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        try {
            value = value.toUpperCase();
            switch (value){
                
                case "S":
                    CraftingControl swordCraft = new CraftingControl();
                    swordCraft.craftSword();
                    this.console.println("You now have "+Resources.swords + " swords");
                    this.console.println("Left over resources: " +Resources.wood +" wood, " + Resources.ore + " ore, and " + Resources.gold+" gold");
                    break;
                case "P":
                    CraftingControl shieldCraft = new CraftingControl();
                    shieldCraft.craftShield();
                    this.console.println("You now have "+Resources.shields + " shields");
                    this.console.println("Left over resources: " +Resources.wood +" wood, " + Resources.ore + " ore, and " + Resources.gold+" gold");
                    break;
                case "B":
                    CraftingControl bowCraft = new CraftingControl();
                    bowCraft.craftBow();
                    this.console.println("You now have "+Resources.bows + " bows");
                    this.console.println("Left over resources: " +Resources.wood +" wood, " + Resources.ore + " ore, and " + Resources.gold+" gold");
                    break;
                case "W":
                    CraftingControl wagonCraft = new CraftingControl();
                    wagonCraft.craftWagon();
                    break;
                case "C":
                    CraftingControl ropeCraft = new CraftingControl();
                    ropeCraft.craftRope();
                    this.console.println("You now have "+Resources.rope + " ropes");
                    this.console.println("Left over resources: " +Resources.wood +" wood, " + Resources.ore + " ore, and " + Resources.gold+" gold");
                    break;
                case "SH":
                    break;
                default:
                    ErrorView.display(this.getClass().getName(), "That isn't an item to be crafted, try again");
            }
            
            return false;
        } catch (CraftingControlException ex) {
            ErrorView.display(this.getClass().getName(), "You can't afford that one!");
        }
        return true;
    }
    
    private void craftSword(){
        this.console.println(CraftingItems.Shield);
            this.console.println("Congratulation you just crafted a sword");
        
    }
    private void craftShield(){
            this.console.println("Congratulation you just crafted a shield");
        
    }
    private void craftBow(){
            this.console.println("Congratulation you just crafted a bow");
        
    }
    private void craftWagon(){
            this.console.println("Congratulation you just made you wagon bigger");
        
    }
    private void craftRope(){
            this.console.println("Congratulation you just crafted a string");
        
    }
    
    public static CraftingItems[] leastToMost(CraftingItems[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].getGold() < arr[index].getGold())
                    index = j;
      
            CraftingItems smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            
        }
        return arr;
    }

    
}
