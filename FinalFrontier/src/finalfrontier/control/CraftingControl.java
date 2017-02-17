/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

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
}
