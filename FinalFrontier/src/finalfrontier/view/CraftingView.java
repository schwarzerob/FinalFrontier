/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.CraftingControl;
import finalfrontier.model.Craft;
import finalfrontier.model.Craft.CraftingItems;

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
        value = value.toUpperCase();
        switch (value){
        
        case "S":
            CraftingControl swordCraft = new CraftingControl();
            swordCraft.craftSword();
            break;
        case "P":
            CraftingControl shieldCraft = new CraftingControl();
            shieldCraft.craftShield();
            break;
        case "B":
            CraftingControl bowCraft = new CraftingControl();
            bowCraft.craftBow();
            break;
        case "W":
            CraftingControl wagonCraft = new CraftingControl();
            wagonCraft.craftWagon();
            break;
        case "C":
            CraftingControl ropeCraft = new CraftingControl();
            ropeCraft.craftRope();
            break;
        case "SH":
            CraftingControl showMeTheMoney = new CraftingControl();
            showMeTheMoney.leastToMost();
            
        default:
            System.out.println("That Item can't be crafted, try again");
    }
        return false;
    
    }
    private void craftSword(){
        System.out.println(CraftingItems.Shield);
            System.out.println("Congratulation you just crafted a sword");
        
    }
    private void craftShield(){
            System.out.println("Congratulation you just crafted a shield");
        
    }
    private void craftBow(){
            System.out.println("Congratulation you just crafted a bow");
        
    }
    private void craftWagon(){
            System.out.println("Congratulation you just made you wagon bigger");
        
    }
    private void craftRope(){
            System.out.println("Congratulation you just crafted a string");
        
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
     
    public static void main(String a[]){
         
        CraftingItems[] arr1 = CraftingItems.values();
        CraftingItems[] arr2 = leastToMost(arr1);
        for(CraftingItems i:arr2){
            System.out.println(i.getDescription()+ " " + i.getGold() );
        }
    }
}
    




  
            
    


