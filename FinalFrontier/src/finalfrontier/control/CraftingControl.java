/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import static finalfrontier.model.Character.LUMBERJACK;
import finalfrontier.model.Resources;
import java.io.Serializable;
import java.util.Scanner;


/**
 *
 * @author Gabriel
 */
public class CraftingControl implements Serializable {
  public int craftMaster (int radius, int area) { 
          
          //Variables
          int cost;
                  
          if (radius <= -1 ) {
            return -1; 
        }
        switch (radius) {
            case 7 :
            case 9 :
                 cost =((area*2)*2);
                return cost; 
               
            case 5 :
            case 3 :
                 cost =((area*2)*2);
                return cost;   
                
            default:
                System.out.println("Invalid input.");
                break;
            }
        
       
      
        
   return 0;     
  }

        public String whichOne;
        public String whichCharacter(){
             whichOne = "LUMBERJACK";
            Scanner value = new Scanner(System.in);
            
            
            return whichOne;
        }
  
  
        public int craftSword(){
            //cost: 10 wood, 15 ore, 20 gold
            
            int wood = (LUMBERJACK.getWood());
            int ore = (LUMBERJACK.getOre());
            int gold = (LUMBERJACK.getGold());
            Resources.wood -= wood;
            Resources.ore -= ore;
            Resources.gold -= gold;
            
            Resources.swords += 1;
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

}
