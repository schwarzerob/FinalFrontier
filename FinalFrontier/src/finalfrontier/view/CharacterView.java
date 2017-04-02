/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.control.CharacterControl;
import finalfrontier.exceptions.CharacterControlException;
import finalfrontier.model.MyCharacter;
import finalfrontier.model.Resources;

/**
 *
 * @author rschw
 */
public class CharacterView extends View{

    public static String characterName;
    public CharacterView() {
        super("\n ************************"
            + "\n  Which character do you want to play?"
            + "\n L - Lumberjack begins with more wood than the others."
            + "\n F - Farmer leaves with extra grain for the trip."
            + "\n B - the Blacksmith has more ore for the crafting."
            + "\n H - Hunters already have extra food when he leaves."
            + "\n S - a Soldier has more battle equipment to start with."
            + "\n C - Cashier from the bank, well of course, he's already got extra cash in his pocket."
            + "\n ************************");
    }

    @Override
    public boolean doAction(String value) {
        try{
        value = value.toUpperCase();
        switch (value){
            case "L":
                CharacterControl char0 = new CharacterControl();
                char0.getResources(0);
                break;
            case "F":
                CharacterControl char1 = new CharacterControl();
                char1.getResources(1);
                break;
            case "B":
                CharacterControl char2 = new CharacterControl();
                char2.getResources(2);
                break;
            case "H":
                CharacterControl char3 = new CharacterControl();
                char3.getResources(3);
                break;
            case "S":
                CharacterControl char4 = new CharacterControl();
                char4.getResources(4);
                break;
            case "C":
                CharacterControl char5 = new CharacterControl();
                char5.getResources(5);
                break;
            default:
                this.console.println("\n*** Invalid selection ***"
                        +"\n    Try again");
                break;
        }
        return true;
        }catch(CharacterControlException ex){
            ErrorView.display(this.getClass().getName(),"Error");
        }
        return false;
    }
    
}
