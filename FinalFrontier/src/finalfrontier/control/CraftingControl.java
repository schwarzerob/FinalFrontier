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
                throws CraftingControlException {           //throws
            //cost: 3 wood, 15 ore, 5 gold
            
            int wood = 5, ore = 15, gold = 10;
            if(Resources.wood < wood || Resources.ore < ore || Resources.gold < gold){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.wood -= wood;
            Resources.ore -= ore;
            Resources.gold -= gold;
            Resources.swords += 1;
            
            System.out.println("Left over resources: " +Resources.wood +" wood, " + Resources.ore + " ore, and " + Resources.gold+" gold");
            System.out.println("You now have "+Resources.swords + " swords");
        }
        
        public static void craftShield()
                throws CraftingControlException {           //throws
            //cost: 10 wood, 5 ore
            int wood = 10, ore = 5;
            if(Resources.wood < wood || Resources.ore < ore){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.wood-=wood;
            Resources.ore-=ore;
            Resources.shields+=1;
            System.out.println("Left over resources: " +Resources.wood +" wood, and " + Resources.ore + " ore");
            System.out.println("You now have "+Resources.shields + " shields");
        }
        public static void craftBow()
            throws CraftingControlException {
            //cost: 6 wood, 4 rope
            int wood = 1, rope = 1;
            if(Resources.wood < wood || Resources.rope < rope){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.wood -= wood;
            Resources.rope -= rope;
            Resources.bows += 1;
            System.out.println("Left over resources: " +Resources.wood +" wood, and " + Resources.rope + " rope");
            System.out.println("You now have "+Resources.bows + " bows");
            
        }
        public static void craftRope()
            throws CraftingControlException{
            //cost: 15 grain
            int grain = 15;
            if(Resources.grain < grain){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.grain -= grain;
            Resources.rope += 1;
            System.out.println("Left over resources: " +Resources.grain + " rope");
            System.out.println("You now have "+Resources.rope + " ropes");
        }
        public int craftWagon(){
            //go to wagon
            int wagon = 1;
            return wagon;}
 
    public void leastToMost() {
       
    }
    
}
