/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfrontier.view;

import finalfrontier.model.MyCharacter;
import finalfrontier.model.Resources;

/**
 *
 * @author rschw
 */
public class CharacterView extends View{

    static String characterName;
    public CharacterView() {
        super("\n ************************"
            + "\n * Which character do you want to play?"
            + "\n *L - Lumberjack begins with more wood than the others."
            + "\n *F - Farmer leaves with extra grain for the trip."
            + "\n *B - the Blacksmith has more ore for the crafting."
            + "\n *H - Hunter already has extra food when he leaves."
            + "\n *S - a Soldier has more battle equipment to start with."
            + "\n *C - the Cashier, well of course, he's already got extra cash."
            + "\n ************************");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value){
            case "L":
                this.getResources(0);
                break;
            case "F":
                this.getResources(1);
                break;
            case "B":
                this.getResources(2);
                break;
            case "H":
                this.getResources(3);
                break;
            case "S":
                this.getResources(4);
                break;
            case "C":
                this.getResources(5);
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                                  +"\n    Try again");
                break;
        }
        
        return true;
    }

    public String getResources(int i) {
        MyCharacter charNames[] = MyCharacter.values();
        int a = charNames[i].ordinal();
        characterName = charNames[a].name();
        Resources.wood=charNames[a].getWood();
        Resources.wood=charNames[a].getGrain();
        Resources.wood=charNames[a].getOre();
        Resources.wood=charNames[a].getSheep();
        Resources.wood=charNames[a].getSwords();
        Resources.wood=charNames[a].getGold();
        return characterName;
    }
    
}
