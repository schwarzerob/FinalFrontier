/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.exceptions.CraftingControlException;
import static finalfrontier.model.MyCharacter.FARMER;
import static finalfrontier.model.MyCharacter.LUMBERJACK;
import finalfrontier.model.Craft;
import finalfrontier.model.CraftingItems;
import finalfrontier.model.Resources;
import java.io.Serializable;
import java.util.Scanner;


/**
 *
 * @author Gabriel
 */
public class CraftingControl implements Serializable {

    /*private static void orderPrice(int input) {
    }
        public String whichOne;
        public String whichCharacter(){
            Scanner value = new Scanner(System.in);
             whichOne = value.nextLine();
            return whichOne = LUMBERJACK.getDescription();
        }
        */
  
        public static void craftSword()
                throws CraftingControlException {
            //cost: 10 wood, 15 ore, 20 gold
            
            int wood = 5, ore = 15, gold = 10;
            if(Resources.wood < wood || Resources.ore < ore || Resources.gold < gold){
                throw new CraftingControlException("You can't afford that!");
            }
            Resources.wood -= wood;
            Resources.ore -= ore;
            Resources.gold -= gold;
            Resources.swords += 1;
            
            System.out.println("Left over resources: " +Resources.wood +" wood, " + Resources.ore + " ore, and " + Resources.gold+" gold");
            System.out.println("You now have "+Resources.swords + " swords");
        }
        
        public static void craftShield()
                throws CraftingControlException {
            //cost: 10 wood, 5 ore
            int wood = 10, ore = 5;
            if(Resources.wood < wood || Resources.ore < ore){
                throw new CraftingControlException("You can't afford that!");
            }
            Resources.wood-=wood;
            Resources.ore-=ore;
            Resources.shields+=1;
            System.out.println("Left over resources: " +Resources.wood +" wood, and " + Resources.ore + " ore");
            System.out.println("You now have "+Resources.swords + " swords");
        }
        public int craftBow(){
            int bows = 1;
            return bows;}
        public int craftWagon(){
            int wagon = 1;
            return wagon;}
        public int craftRope(){
            int rope = 1;
            return rope;}
 
    public void leastToMost() {
       
    }
    
}
