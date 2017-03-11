/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

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
                   +"\nC - String"
                   +"\nQ - Quit to Game Menu"
                   +"\n-------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value){
        
        case "S":
            this.craftSword();
            break;
        case "P":
            this.craftShield();
            break;
        case "B":
            this.craftBow();
            break;
        case "W":
            this.craftWagon();
            break;
        case "C":
            this.craftString();
            break;
        default:
            System.out.println("That Item can't be crafted, try again");
    }
        return false;
    
    }
    private void craftSword(){
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
    private void craftString(){
            System.out.println("Congratulation you just crafted a string");
        
    }
    
    
    
}



  
            
    


