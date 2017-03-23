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
  
        public int craftSword()
                throws CraftingControlException {
            //cost: 10 wood, 15 ore, 20 gold
            
            int wood = 10;
            int ore = 15;
            int gold = 20;
            Resources.wood -= wood;
            Resources.ore -= ore;
            Resources.gold -= gold;
            System.out.println(wood +" " + ore + " " + gold);
            Resources.swords += 1;
            if(Resources.wood < wood || Resources.ore < ore || Resources.gold < gold){
                throw new CraftingControlException("You can't afford that!");
            }
            return Resources.swords;
            
            
            
            
        }public int craftShield(){
            int shield = 1;
            return shield;
        }public int craftBow(){
            int bows = 1;
            return bows;
        }public int craftWagon(){
            int wagon = 1;
            return wagon;
        }public int craftRope(){
            int rope = 1;
            return rope;
        }
 
    public void leastToMost() {
       
    }
    
}
