/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.control;

import finalfrontier.model.Craft;
import finalfrontier.model.MyCharacter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rschw
 */
public class CharacterControl {
    public CharacterControl(){
        //Description of the character
        //define starting strength
        //define starting resources        
    }
    
    
    public static void sortCharNames(MyCharacter[] args){
        MyCharacter charNames[] = MyCharacter.values(); //create Array from MyCharacter enum
        
        //Gather character that has the most of a particular resource at the start of the game.
        Arrays.sort(charNames);
        int maxValue=0;
        String withMost = null;
        for(MyCharacter theMost: charNames){
            System.out.println(theMost.name() + " " + theMost.getOre());
            if(theMost.getOre()>maxValue){
                maxValue=theMost.getOre();
                withMost = theMost.name();
            }
        }
                System.out.println("\n"+withMost+ " has the most with "+maxValue);
    }
}
