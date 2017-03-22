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
        MyCharacter[] charNames = MyCharacter.values();
        
        for(MyCharacter name: charNames){
            System.out.println("Character: "+name);
            String myName=name.toString();
            if(myName.compareTo(myName));
        }
        
    }
}
