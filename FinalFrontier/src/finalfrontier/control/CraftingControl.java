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
import finalfrontier.view.WagonView;
import java.io.Serializable;
import java.util.Scanner;


/**
 *
 * @author Gabriel
 */
public class CraftingControl implements Serializable {
  
        public void craftSword()
                throws CraftingControlException {           //throws
            //cost: 3 wood, 15 ore, 5 gold
            
            int wood = 1, ore = 5, gold = 1;
            if(Resources.wood < wood || Resources.ore < ore || Resources.gold < gold){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.wood -= wood;
            Resources.ore -= ore;
            Resources.gold -= gold;
            Resources.swords += 1;
        }
        
        public void craftShield()
                throws CraftingControlException {           //throws
            //cost: 10 wood, 5 ore
            int wood = 10, ore = 5;
            if(Resources.wood < wood || Resources.ore < ore){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.wood-=wood;
            Resources.ore-=ore;
            Resources.shields+=1;
        }
        public void craftBow()
            throws CraftingControlException {
            //cost: 6 wood, 4 rope
            int wood = 1, rope = 1;
            if(Resources.wood < wood || Resources.rope < rope){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.wood -= wood;
            Resources.rope -= rope;
            Resources.bows += 1;
        }
        
        public void craftRope()
            throws CraftingControlException{
            //cost: 15 grain
            int grain = 15;
            if(Resources.grain < grain){
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
            Resources.grain -= grain;
            Resources.rope += 1;
        }
        
        public void craftWagon()
            throws CraftingControlException{
            //go to wagon
            WagonView craftWagon = new WagonView();
            craftWagon.display();
                throw new CraftingControlException("You can't afford that!");           //throw new
            }
}
